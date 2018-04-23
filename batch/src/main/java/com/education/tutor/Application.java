package com.education.tutor;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.education.tutor.db.mapper")
public class Application {

	public static final String RedisRebuildOption = "rrb";

	public static final String ClearRedisUPOption = "cup";

	public static final String ClearRedisTopicOption = "ct";

	public static final String HelpOption = "h";

	public static final String WebOption = "web";
	
	public static final String EventSourcingOption = "es";

	public static final String OrgImportOption = "oi";

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(Application.class);
		CommandLineParser parser = new DefaultParser();
		Options options = Application.options();
		options.addOption(WebOption, "webMode", false, "Run as web application");
		CommandLine cl = parser.parse(options, args);
		if (!cl.hasOption(WebOption)) {
			app.setWebEnvironment(false);
		}
		app.run(args);
	}

	@Bean
	public CommandLineParser commandLineParser() {
		return new DefaultParser();
	}

	@Bean
	public static Options options() {
		// create the Options
		Options options = new Options();
		options.addOption(
				Option.builder(HelpOption).longOpt("help").optionalArg(true).desc("Usage introduction").build());
		options.addOption(RedisRebuildOption, "redisRebuild", false, "Rebuild redis cache of user interaction data");
		options.addOption(ClearRedisUPOption, "clearUserPrincipal", false, "Clear redis cached user principals");
		options.addOption(ClearRedisTopicOption, "clearTopic", false, "Clear redis cached topics");
		options.addOption(WebOption, "webMode", false, "Run as web application");
		options.addOption(EventSourcingOption, "Logging Event", false, "Logging event issued by app");
		options.addOption(OrgImportOption, "Import Organization", false, "Import Organization and User");
		return options;
	}

}
