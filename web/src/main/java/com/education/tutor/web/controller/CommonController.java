package com.education.tutor.web.controller;

import com.education.tutor.api.Attachment;
import com.education.tutor.api.common.*;
import com.education.tutor.service.CommonService;
import com.education.tutor.service.EmailService;
import com.education.tutor.service.I18nService;
import com.education.tutor.vo.UserPrincipalVO;
import com.education.tutor.web.security.RegiAuthenticationToken;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;


@Controller
@RequestMapping("/common")
public class CommonController extends AuthenticatedController {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	CommonService commonService;

	@Autowired
	I18nService i18nService;
	
	@Value("${attachment.download.prefix}")
	String attachmentUrlPrefix;

//	@Autowired
//	JavaMailSender JavaMailSender;
	
	@Autowired
	EmailService emailService;
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/download/{groupName}/{remoteFileName}/{specFileName}", produces = "application/octet-stream")
	public ResponseEntity<byte[]> download(@PathVariable String groupName, @PathVariable String remoteFileName,
			@PathVariable String specFileName) {
		byte[] content = null;
		HttpHeaders headers = new HttpHeaders();
		try {
//			content = fastDfsClientService.download(groupName, remoteFileName);
			headers.setContentDispositionFormData("attachment",
					new String(specFileName.getBytes("UTF-8"), "iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return new ResponseEntity<byte[]>(content, headers, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/upload", produces = "application/json")
	@ResponseBody
	public UploadRes upload(MultipartHttpServletRequest req) {
		List<MultipartFile> files = req.getFiles("file");
		String mate = req.getHeader("mate");
		logger.debug("_____________upload-mate: "+mate);
		UploadRes res = new UploadRes();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserPrincipalVO user = ((RegiAuthenticationToken) auth).getUserPrincipal();
		try {
			String[] mates = null;
			if(StringUtils.isNotEmpty(mate)){
				mates = mate.split(",");
			}else{
				mates = new String[files.size()];
			}

			int i = -1;
			for (MultipartFile file : files) {
				i++;
				byte[] content = file.getBytes();
				String ext = FilenameUtils.getExtension(file.getOriginalFilename());
				// fastdfs setup finished uncomment below, replace local file
				logger.info(" before save " + file.getOriginalFilename() + " size " + content.length);
				String relativePath = "";//fastDfsClientService.upload(content, file.getOriginalFilename(), ext,content.length, null);
				// String relativePath = UUID.randomUUID().toString() + "_" +
				// file.getOriginalFilename();
				// Files.write(content, new File("/var/" + relativePath));
				logger.info( " after save " + file.getOriginalFilename() + " to "
						+ relativePath);
				String result = commonService.saveAttachment(file.getOriginalFilename(), ext, content.length,
						file.getContentType(), relativePath,"",i);
				logger.info( " save attachment with id=" + result);
				Attachment a = new Attachment();
				a.setId(Long.valueOf(result.split(":")[0]));
				a.setUrl(attachmentUrlPrefix + result.split(":")[1]);
				res.getAttachments().add(a);
				logger.info("return url: " + a.getUrl());
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			res.setCode(105);
			res.setMessage(i18nService.getMessage(res.getCode() + "", ""));
		}
		if (res.getCode() == -1) {
			res.setCode(0);
		}
		return res;
	}



	@RequestMapping(method = RequestMethod.POST, path = "/refresh", produces = "application/json")
	@ResponseBody
	public RefreshRes refresh(@RequestBody RefreshReq req) {
		RefreshRes res = commonService.refresh(processReq(req), req);
		return res;
	}


	@RequestMapping(method = RequestMethod.POST, path = "/sendEmail", produces = "application/json")
	@ResponseBody
	public SendEmailRes sendEmail(@RequestBody SendEmailReq req) {
		
		SendEmailRes res  = new SendEmailRes();
		
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setText(req.getText());
//		message.setBcc(req.getCc());
//		message.setFrom(req.getFrom());
//		message.setTo(req.getTo());
//		message.setSubject(req.getSubject());
//		message.setSentDate(DateUtils.getNowTime());
//		JavaMailSender.send(message);
		
		
		try {
			 emailService.sendEmail(new String[]{req.getTo()}, null, null, req.getSubject(), req.getLang(), req.getTemplateName(),
		                new String[]{req.getText()});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		res.setCode(0);
		return res;
	}

	

}
