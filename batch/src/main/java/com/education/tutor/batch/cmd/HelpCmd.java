package com.education.tutor.batch.cmd;

import com.education.tutor.Application;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Component
@Order(value = 100)
public class HelpCmd implements ApplicationRunner {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	CommandLineParser commandLineParser;

	@Autowired
	Options options;

	@Autowired
	EventSouringLogCmd eventSouringLogCmd;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		CommandLine cl = commandLineParser.parse(options, args.getSourceArgs());
		if (cl.hasOption(Application.HelpOption)) {
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("java -jar tutor-batch.jar -options", options);
		}
		if (cl.getOptions().length == 0) {
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("batch", options);
		}
		if (!cl.hasOption(Application.WebOption)) {
			eventSouringLogCmd.getLatch().await(5, TimeUnit.SECONDS);
			eventSouringLogCmd.getLatch().countDown();
			Arrays.asList(eventSouringLogCmd.getEventData()).forEach(w -> {
				try {
					if (w != null) {
						w.close();
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			});
			eventSouringLogCmd.getOffset().forEach((k, v) -> {
				try {
					String newFileName = k.getAbsolutePath().replace(".log", "_") + v + ".log";
					logger.info(newFileName);
					k.renameTo(new File(newFileName));
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			});
			System.exit(0);
		}
	}

}
