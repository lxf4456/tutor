package com.education.tutor.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;

@Component
public class EventSourcingLoggerFilter extends AbstractRequestLoggingFilter {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Value("${spring.kafka.event.logger.topic}")
	String topic;

	public void sendMessage(String message) {
		ListenableFuture<SendResult<String, String>> result = kafkaTemplate.send(topic, message);
		result.addCallback(sendResult -> {
			logger.debug("send Result ProducerRecord " + sendResult.getProducerRecord().toString());
			logger.debug("send Result RecordMetadata " + sendResult.getRecordMetadata().topic() + ":"
					+ sendResult.getRecordMetadata().timestamp() + ":" + sendResult.getRecordMetadata().checksum());
		}, exception -> {
			exception.printStackTrace();
			logger.error(exception.getMessage());
		});
	}

	@Override
	protected void afterRequest(HttpServletRequest arg0, String arg1) {
		sendMessage("after:" + arg1);
	}

	@Override
	protected void beforeRequest(HttpServletRequest arg0, String arg1) {
		sendMessage("before:" + arg1);
	}

}
