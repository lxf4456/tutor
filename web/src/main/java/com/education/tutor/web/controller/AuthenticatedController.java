package com.education.tutor.web.controller;


import com.education.Application;
import com.education.tutor.api.BaseReq;
import com.education.tutor.api.BaseRes;
import com.education.tutor.db.FieldConstants;
import com.education.tutor.vo.UserPrincipalVO;
import com.education.tutor.web.security.RegiAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticatedController {

    public UserPrincipalVO processReq(BaseReq req) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserPrincipalVO user = ((RegiAuthenticationToken) auth).getUserPrincipal();

        if (user != null) {
         //   req.setLang(FieldConstants.USER_MAIN_LANG.values()[user.getBasic().getUserLang()].name());
        } else {
            if (!FieldConstants.USER_MAIN_LANG.zh.name().equals(req.getLang())
                    && !FieldConstants.USER_MAIN_LANG.ru.name().equals(req.getLang())
                    && !FieldConstants.USER_MAIN_LANG.fr.name().equals(req.getLang())
                    && !FieldConstants.USER_MAIN_LANG.es.name().equals(req.getLang())) {
                req.setLang(Application.DEFAULT_LANG);
            }
        }

        return user;
    }


    public void processReqGuest(BaseReq req) {

        if (req == null) {
            req = new BaseReq();
        }

        if (!FieldConstants.USER_MAIN_LANG.zh.name().equals(req.getLang())
                && !FieldConstants.USER_MAIN_LANG.ru.name().equals(req.getLang())
                && !FieldConstants.USER_MAIN_LANG.fr.name().equals(req.getLang())
                && !FieldConstants.USER_MAIN_LANG.es.name().equals(req.getLang())) {
            req.setLang(Application.DEFAULT_LANG);
        }
    }

    public void processRes(BaseRes res) {
        if (res.getCode() == -1) {
            res.setCode(0);
        }
    }

}
