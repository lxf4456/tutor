package com.education.tutor.web.controller;


import com.education.tutor.api.user.MyInfoReq;
import com.education.tutor.api.user.MyInfoRes;
import com.education.tutor.api.user.SetMyLanguageReq;
import com.education.tutor.api.user.SetMyLanguageRes;
import com.education.tutor.service.I18nService;
import com.education.tutor.service.UserService;
import com.education.tutor.vo.UserPrincipalVO;
import com.education.tutor.web.security.RegiAuthenticationToken;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController extends AuthenticatedController {

    @SuppressWarnings("unused")
    private final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    UserService userService;

    @Autowired
    I18nService i18nService;

    

    @RequestMapping(method = RequestMethod.POST, path = "/myInfo", produces = "application/json;charset=utf8")
    @ResponseBody
    public MyInfoRes myInfo(@RequestBody MyInfoReq req) {
        MyInfoRes res = userService.myInfo(req, processReq(req));
        return res;
    }



    @RequestMapping(method = RequestMethod.POST, path = "/setMyLanguage", produces = "application/json;charset=utf8")
    @ResponseBody
    public SetMyLanguageRes setMyLanguage(@RequestBody SetMyLanguageReq req) throws Exception {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserPrincipalVO user = ((RegiAuthenticationToken) auth).getUserPrincipal();
        SetMyLanguageRes res = userService.setMyLanguage(req.getLang(), user);
        return res;
    }
	
}
