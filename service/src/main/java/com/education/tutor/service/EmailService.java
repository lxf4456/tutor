package com.education.tutor.service;

import com.education.tutor.api.EmailUser;
import com.education.tutor.db.mapper.CommonMapper;
import com.education.tutor.util.DateUtils;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.File;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
	private CommonMapper commonMapper;

	@Autowired
	private EmailService emailService;



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


	@Scheduled(cron = "0 0 0/1 * * ? ")
	public void time1() {
		try {
			System.out.println("time=====1=============="+DateUtils.getDateStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
			List<EmailUser> interviews = commonMapper.getInterview();
			for(EmailUser eu:interviews){
				if(getDatePoor(eu.getStart(),new Date())==24){
					emailService.sendEmail(new String[]{eu.getEmail()}, null, null, "INTERVIEW", "en", "interview3",
							new String[]{eu.getUserName(),getTime(eu.getTimezone(),eu.getStart()),eu.getVaule()});
				}
			}


			List<EmailUser> courseware = commonMapper.getCourseware();
			for(EmailUser eu:courseware){
				if(getDatePoor(eu.getStart(),new Date())==48){
					emailService.sendEmail(new String[]{eu.getEmail()}, null, null, "COURSEWARE", "en", "courseware",
							new String[]{eu.getUserName()});
				}
			}


			List<EmailUser> studentEvaluation = commonMapper.getStudentEvaluation();
			for(EmailUser eu:studentEvaluation){
				if(getDatePoor(eu.getStart(),new Date())==24){
					emailService.sendEmail(new String[]{eu.getEmail()}, null, null, "EVALUATION", "en", "feedback",
							new String[]{eu.getUserName()});
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Scheduled(cron = "0 0 0 ? * SAT ")
	public void time2() {
		System.out.println("time======2============="+DateUtils.getDateStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
		List<EmailUser> interviews = commonMapper.getSchedule();
		for(EmailUser eu:interviews){
			emailService.sendEmail(new String[]{eu.getEmail()}, null, null, "schedule", "en", "schedule",
						new String[]{eu.getUserName()});
		}
	}


	public  int getDatePoor(Date endDate, Date nowDate) {

		long nd = 1000 * 24 * 60 * 60;
		long nh = 1000 * 60 * 60;

		// 获得两个时间的毫秒时间差异
		long diff = endDate.getTime() - nowDate.getTime();
		// 计算差多少天
		long day = diff / nd;
		// 计算差多少小时
		long hour = diff % nd / nh;
		return (int)hour;
	}

	public static String  getTime(String timezone,Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int hour = 8;
		int minute = 0;
		if(timezone.indexOf(" ")>0){
			String time = timezone.split(":")[1];
			if(time.indexOf(":")>0){
				hour = Integer.parseInt(time.split(":")[0]);
				minute = Integer.parseInt(time.split(":")[1]);

			}else{
				hour = Integer.parseInt(time);
			}
		}
		calendar.add(Calendar.HOUR,hour);
		calendar.add(Calendar.MINUTE,minute);
		return sdf.format(calendar.getTime());

	}


}
