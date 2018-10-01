package com.education.tutor.service;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmailService {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Value("${smtp.host}")
	String smtpHost;

	@Value("${smtp.port}")
	String smtpPort;

	@Value("${smtp.username}")
	String smtpUsername;

	@Value("${smtp.password}")
	String smtpPassword;



	@Autowired
	Configuration configuration;

	Map<String, String> templates = new HashMap<String, String>();

	private String getTemplate(String lang, String templateName, String[] params) throws Exception {
		String key = "email_" + templateName + "_" + lang + ".ftl";
		Template t = configuration.getTemplate(key); // freeMarker template
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("params", params);
		String content = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
		return content;
	}

	public String sendEmail(String[] to, String[] cc, String[] bcc, String title, String lang, String templateName,
			String[] params) {
		try {
			if (to == null) {
				logger.error("to is null");
				throw new RuntimeException("email to is null");
			}
			HtmlEmail email = new HtmlEmail();
			email.setCharset("UTF-8");
			email.setHostName(smtpHost);
			email.setSmtpPort(Integer.parseInt(smtpPort));
			email.setSSLOnConnect(true);
			email.setAuthentication(smtpUsername, smtpPassword);
			email.setFrom(smtpUsername);
			email.setSubject(title);
			String body = getTemplate(lang, templateName, params);
			email.setHtmlMsg(body);
			email.setTextMsg(body);
			email.addTo(to);
			if (cc != null && cc.length > 0) {
				email.addCc(cc);
			}
			if (bcc != null && bcc.length > 0) {
				email.addBcc(bcc);
			}

			// 发送
			return email.send();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public int sendEmailWithAttachments(String[] to, String[] cc, String[] bcc, String title, String lang,
			String templateName, String[] params, List<InputStream> attachments) {
		// TODO need to implement
		return 0;
	}

	public int sendEmailWithUrlAttachments(String[] to, String[] cc, String[] bcc, String title, String lang,
			String templateName, String[] params, List<String> attachments) {
		// TODO need to implement
		return 0;
	}

	public int sendEmailWithFileAttachments(String[] to, String[] cc, String[] bcc, String title, String lang,
			String templateName, String[] params, List<File> attachments) {
		// TODO need to implement
		return 0;
	}

}
