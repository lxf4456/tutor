package com.education.tutor.web.controller;

import com.education.Application;
import com.education.tutor.api.login.*;
import com.education.tutor.service.CommonService;
import com.education.tutor.service.I18nService;
import com.education.tutor.service.LoginService;
import com.education.tutor.service.UserService;
import com.education.tutor.vo.UserPrincipalVO;
import com.education.tutor.web.security.JwtTokenUtil;
import com.education.tutor.web.security.RegiAuthenticationProvider;
import com.education.tutor.web.security.RegiAuthenticationToken;
import com.education.tutor.web.sso.SsoClientDeprecated;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mobile.device.Device;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Encoder;

import javax.annotation.PostConstruct;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/login")
public class LoginController extends AuthenticatedController{

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	I18nService i18nService;

	@Autowired
	CommonService commonService;

	@Autowired
	LoginService loginService;

	@Autowired
	SsoClientDeprecated ssoClient;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@Autowired
	RegiAuthenticationProvider regiAuthenticationProvider;
	@Autowired
	UserService userService;

	// @Autowired
	// private AuthenticationManager authenticationManager;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	StringRedisTemplate redisTemplate;

	ObjectMapper om = new ObjectMapper();


	@Value("${redis-user-logintoken.duration.seconds}")
	private long duration = 3600 * 72;

	public final static String SENDVALITECODETEMP = "TEMP:VALITECODE_";

	@PostConstruct
	public void init() {
		om.setSerializationInclusion(Include.NON_NULL);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/globalAreaList", produces = "application/json")
	@ResponseBody
	public GlobalAreaListRes globalAreaList(@RequestBody GlobalAreaListReq req) {
		GlobalAreaListRes res = loginService.getGlobalAreaList(req);
		if (res.getCode() == -1) {
			res.setCode(0);
		}
		return res;
	}



	@RequestMapping(method = RequestMethod.POST, path = "/login", produces = "application/json;charset=utf8")
	@ResponseBody
	public LoginRes login(@RequestBody LoginReq req, Device device, HttpServletRequest request) {

		String userAgent = request.getHeader("User-Agent");
//		String remote = request.getRemoteAddr() + ":" + request.getRemoteHost();

		logger.debug(req.getUserName());
		// Perform the security
		LoginRes res = new LoginRes();
		if (req.getLang() == null) {
			req.setLang(Application.DEFAULT_LANG);
		}
		if (req.getPassword() == null || req.getPassword().length() == 0) {
			res.setCode(4104);
			res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
			return res;
		}
		try {
			/**
			 * 此处为标准spring-security框架写法，支持级联Authentication认证，但是认证失败会由框架处理，返回401，目前前端希望返回200，使用LoginRes的code和message进行信息传递，
			 * 因此改为直接使用RegiAuthenticationProvider,不在使用spring的authenticationManager进行authenticate调用，这样可以在方法中截获异常
			 * final Authentication authentication =
			 * authenticationManager.authenticate(new
			 * UsernamePasswordAuthenticationToken(req.getUserName(),
			 * req.getPassword()));
			 **/
			String userName = req.getUserName().trim();
			if (req.getLoginType() != null && req.getLoginType() == 1 && req.getCountryCode() != null) {
				userName = req.getCountryCode() + "-" + req.getUserName();
			}
			final Authentication authentication = regiAuthenticationProvider
					.authenticate(new UsernamePasswordAuthenticationToken(userName, req.getPassword()));
			if (authentication != null && authentication.isAuthenticated()) {
				SecurityContextHolder.getContext().setAuthentication(authentication);
				RegiAuthenticationToken token = (RegiAuthenticationToken) authentication;
//				Short lang = token.getUserPrincipal().getBasic().getUserLang();
//				if(lang == null ) {
//					userService.setMyLanguage(req.getLang(), token.getUserPrincipal());
//				}
//				res.setAuthorization(token.getJwt());
//				res.setAvatar(token.getUserPrincipal().getBasic().getAvatar());
//				res.setNickName(token.getUserPrincipal().getBasic().getNickName());
//				if (token.getUserPrincipal().getBasic().getGender() == null) {
//					// 3 is unknown
//					res.setSex(0);
//				} else {
////					res.setSex(token.getUserPrincipal().getBasic().getGender() + 1);
//				}
////				res.setUserId(token.getUserPrincipal().getBasic().getUserMainId());
//				res.setPartnerNo(token.getUserPrincipal().getBasic().getPartnerNo());
//				res.setEmail(token.getUserPrincipal().getBasic().getEmail());
//				res.setMobile(token.getUserPrincipal().getBasic().getMobile());
//				res.setUserName(token.getUserPrincipal().getBasic().getUsername());
//				res.setCountryCode(token.getUserPrincipal().getBasic().getCountryCode());
//				res.setLang(FieldConstants.USER_MAIN_LANG.values()[token.getUserPrincipal().getBasic().getUserLang().intValue()].name());

			} else {
				res.setCode(4104);
				res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
			}
		} catch (UsernameNotFoundException une) {
			res.setCode(4104);
			res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
		}
		if (res.getCode() == -1) {
			res.setCode(0);
		}
		return res;
	}


	@RequestMapping(method = RequestMethod.POST, path = "/getCaptcha", produces = "image/jpeg")
	public String captcha(@RequestBody GetCaptchaReq req, HttpServletResponse response) throws Exception {
		// Set to expire far in the past.
		response.setDateHeader("Expires", 0);
		// Set standard HTTP/1.1 no-cache headers.
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		// Set IE extended HTTP/1.1 no-cache headers (use addHeader).
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		// Set standard HTTP/1.0 no-cache header.
		response.setHeader("Pragma", "no-cache");
		// return a jpeg
		response.setContentType("image/jpeg");
		// create the text for the image
		BufferedImage bi = loginService.getCaptchaImage(req.getUuid(), req.getType());
		// write the data out
		//ImageIO.write(bi, "jpg", response.getOutputStream());

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ImageIO.write(bi, "jpg", outputStream);

		response.flushBuffer();

		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(outputStream.toByteArray());// 返回Base64编码过的字节数组字符串
	}

	@RequestMapping(method = RequestMethod.POST, path = "/sendVerifyCode", produces = "application/json;charset=utf8")
	@ResponseBody
	public SendVerifyCodeRes sendVerifyCode(@RequestBody SendVerifyCodeReq  req) {
		/*
		 * SendSmsRes res = commonService.sendSmsVerificationCode(req.getLang(),
		 * req.getUuid(), req.getCaptcha(), req.getUserName(), req.getType());
		 */
    	logger.info("sendVerifyCode req: "+req.getRegisterType()+" "+req.getCountryCode()+" "+req.getUserName()+" "+req.getType()+" "+req.getLang());
        if (req.getLang() == null || !req.getLang().equals("zh")) {
            req.setLang("en");
        }
		// if (req.getLang() == null) {
		// req.setLang(Application.DEFAULT_LANG);
		// }

		if (req.getLang() == null || !req.getLang().equals("zh")) {
			req.setLang("en");
		}

		SendVerifyCodeRes res = new SendVerifyCodeRes();
//
//		String tempData = redisTemplate.opsForValue().get(SENDVALITECODETEMP + req.getUserName());
//		if (StringUtils.isNotEmpty(tempData)) {
//			// 发送太频繁
//			res.setCode(1110);
//			res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
//			return res;
//		}

		switch (req.getRegisterType()) {
		case 1:
			res = commonService.sendSmsVerificationCode(req.getLang(), req.getUserName(), req.getCountryCode(),
					req.getType(),req.getCode());
			break;
		case 2:
			res = commonService.sendEmailVerificationCode(req.getLang(), req.getUserName().toLowerCase(), req.getType());
			break;
		default:
			res.setCode(101);
			res.setMessage(i18nService.getMessage("" + res.getCode(), req.getLang()));
		}
		if (res.getCode() == -1) {
			res.setCode(0);
		}

//		if (res.getCode() == 0) {
//			redisTemplate.opsForValue().set(SENDVALITECODETEMP + req.getUserName(),
//					String.valueOf(Calendar.getInstance().getTime()), 10, TimeUnit.SECONDS);
//		}
		logger.info("sendVerifyCode res :"+res.getCode()+" "+res.getMessage());
		return res;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/register", produces = "application/json;charset=utf8")
	@ResponseBody
	public RegisterRes register(@RequestBody RegisterReq req) {
		if (req.getLang() == null) {
			req.setLang(Application.DEFAULT_LANG);
		}
		String password = req.getPassword();
		req.setPassword(passwordEncoder.encode(password));
		req.setUserName(req.getUserName().toLowerCase());
		RegisterRes res = loginService.register(req);
		try {
			String username = req.getUserName();
			if (req.getRegisterType() == 1) {
				// 手机号注册
				username = req.getCountryCode() + "-" + req.getUserName();
			}
			logger.info("call sso username:" + username + ", password:" + password);
			// if (!res.isUserFromBoss()) {
			// ssoClient.register(username, password);
			// }
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		if (res.getCode() == 0) {
			String username = req.getUserName();
			if (req.getRegisterType() == 1) {
				username = req.getCountryCode() + "-" + req.getUserName();
			}
			String jwt = jwtTokenUtil.generateToken(username);
			res.setAuthorization(jwt);
		}
		return res;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/resetPassword", produces = "application/json;charset=utf8")
	@ResponseBody
	public ResetPasswordRes resetPassword(@RequestBody ResetPasswordReq req) {
		if (req.getLang() == null) {
			req.setLang(Application.DEFAULT_LANG);
		}
		String password = req.getPassword();
		req.setPassword(passwordEncoder.encode(password));
		ResetPasswordRes res = loginService.resetPassword(req);
		String username = req.getUserName().toLowerCase();
		if (req.getRegisterType() == 1) {
			// 手机号注册
			username = req.getCountryCode() + "-" + username;
		}
		// try {
		// SsoRes sres = ssoClient.resetPassword(username, null, password);
		// logger.info(username + " reset password sso return " +
		// sres.getSuccess() + "; " + sres.getMsg() + "; "
		// + sres.getJsonStr() + ";");
		// } catch (Exception e) {
		// e.printStackTrace();
		// logger.error(e.getMessage());
		// }
		UserPrincipalVO vo = userService.getUserPrincipalVO(username);
		try {
			String data = om.writeValueAsString(vo);
			redisTemplate.opsForValue().set(UserService.USERPRINCIPAL_KEY_PREFIX + username, data, duration,
					TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		if (res.getCode() == -1) {
			res.setCode(0);
		}
		return res;
	}

}
