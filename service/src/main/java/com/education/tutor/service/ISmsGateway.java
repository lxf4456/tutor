package com.education.tutor.service;

import com.education.tutor.vo.SmsSendResult;

import java.util.List;

public interface ISmsGateway {

	public final static String SMSPREFIX = "SMS:SMSPREFIX_";

	public static enum SMSTEMPLATE {
		REGISTER, RESETPASSWORD
	}

	public String getChannelName();
	/**
	 * 
	 * @param type
	 * @param countryCode
	 * @param phoneNo
	 * @param message
	 * @param ext
	 * @param echoBack
	 */
	public SmsSendResult send(int type, String lang, String countryCode, String phoneNo, String message, String ext,
                              String echoBack);

	/**
	 * 
	 * @param countryCode
	 * @param phoneNo
	 * @param templateId
	 * @param params
	 * @param sign
	 * @param ext
	 * @param echoBack
	 */
	public SmsSendResult sendWithParam(String lang, String countryCode, String phoneNo, SMSTEMPLATE templateId, List<String> params,
			String sign, String ext, String echoBack);

}
