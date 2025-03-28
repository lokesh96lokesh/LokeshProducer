package com.LokeshProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class LokeshProducer {
	@Autowired
	KafkaTemplate<String, String> kt;
	@Value("${my.topic.name}")
	private String topic;
	
	public void sendMessage(String msg) {
		kt.send(topic,msg);
		
	}

}
