package com.education.tutor.batch.cmd;

import com.education.tutor.Application;
import com.education.tutor.service.CommonService;
import com.education.tutor.service.I18nService;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;


@Component
@Order(value = 97)
public class ClearRedisTopicCmd implements ApplicationRunner {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	StringRedisTemplate redisTemplate;

	@Autowired
	I18nService i18nService;

	@Autowired
	CommonService commonService;

	@Autowired
	CommandLineParser commandLineParser;

	@Autowired
	Options options;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		CommandLine cl = commandLineParser.parse(options, args.getSourceArgs());
		if (cl.hasOption(Application.ClearRedisTopicOption)) {
			logger.info("now clearing redis topic");
			redisTemplate.keys("TOPIC:*").forEach(key -> {
				logger.info("delete redis key " + key);
				redisTemplate.delete(key);
			});
			logger.info("finished clear redis topic");
		}
	}

}
