package com.education.tutor.batch.cmd;

import com.education.tutor.Application;
import com.education.tutor.service.I18nService;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@Component
@Order(value = 95)
public class EventSouringLogCmd implements ApplicationRunner {

	private final Log logger = LogFactory.getLog(this.getClass());

	private final CountDownLatch latch = new CountDownLatch(3);

	@Autowired
	I18nService i18nService;

	@Autowired
	CommandLineParser commandLineParser;

	@Autowired
	Options options;

	// size according to partition size in kafka config
	FileWriter[] eventData = new FileWriter[3];

	File p = new File("/var/log/tutor/");

	final Map<File, Long> offset = new HashMap<File, Long>();

	Map<FileWriter, File> fileMap = new HashMap<FileWriter, File>();

	public Map<File, Long> getOffset() {
		return offset;
	}

	Map<Integer, Long> existOffset = new HashMap<Integer, Long>();

	@Override
	public void run(ApplicationArguments args) throws Exception {
		CommandLine cl = commandLineParser.parse(options, args.getSourceArgs());
		if (cl.hasOption(Application.EventSourcingOption)) {
			p.mkdirs();
			Files.list(Paths.get(p.getAbsolutePath()))
					.filter(path -> path.getFileName().toString().startsWith("event-")).forEach(path -> {
						String name = path.getFileName().toString();
						int partition = Integer.parseInt(name.substring(6, name.indexOf("_")));
						long offset = Long.parseLong(name.substring(name.indexOf("_") + 1, name.indexOf(".")));
						logger.info("partition " + partition + ", offset " + offset);
						if (existOffset.get(partition) == null) {
							existOffset.put(partition, offset);
						} else {
							long offset1 = existOffset.get(partition);
							if (offset > offset1) {
								existOffset.put(partition, offset);
							}
						}
					});
			getFileWriter(0);
			getFileWriter(1);
			getFileWriter(2);
		}
	}

	@KafkaListener(id = "aa1", topics = "${spring.kafka.event.logger.topic}", group = "${spring.kafka.event.logger.group}")
	public void listen(ConsumerRecord<?, ?> record) throws IOException {
		logger.debug(record);
		FileWriter w = getFileWriter(record.partition());
		Long offsetCount = existOffset.get(record.partition());
		if (offsetCount != null && record.offset() > offsetCount) {
			w.write(record.toString() + "\n");
			File offsetFile = fileMap.get(w);
			offset.put(offsetFile, record.offset());
		}
	}

	/**
	 * This is a dummy listerner definition, to depict the ability of a listener
	 * port
	 * 
	 * @param record
	 * @param ack
	 */
	@KafkaListener(id = "bar", topicPartitions = { @TopicPartition(topic = "topic1", partitions = { "0", "1" }),
			@TopicPartition(topic = "topic2", partitions = "0", partitionOffsets = @PartitionOffset(partition = "1", initialOffset = "100")) })
	public void listenWithAck(ConsumerRecord<?, ?> record, Acknowledgment ack) {

	}

	public FileWriter getFileWriter(int partition) throws IOException {
		if (eventData[partition] == null) {
			File f = new File(p, "event-" + partition + ".log");
			if (!f.exists()) {
				f.createNewFile();
			}
			eventData[partition] = new FileWriter(f, true);
			fileMap.put(eventData[partition], f);
		}
		return eventData[partition];
	}

	public Writer[] getEventData() {
		return eventData;
	}

	public CountDownLatch getLatch() {
		return latch;
	}

}
