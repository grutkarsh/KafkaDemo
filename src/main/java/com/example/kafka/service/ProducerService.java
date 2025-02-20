package com.example.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.example.kafka.constants.IKafkaConstants;

@Service
@Component
public  class ProducerService {
	private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);

	private final KafkaTemplate<String, String> kafkaTemplate;
	//private final String TOPIC = "kafkaTopic";

	public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public String sendMessage(String message) {
		logger.info(String.format("$$$$ => Producing message : %s", message));

		 
	        kafkaTemplate.send(IKafkaConstants.TOPIC_NAME, message);
	        return "ok";
	}

}
