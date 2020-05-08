package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private KafkaTemplate<Object, Object> kafkaTemplate;
	
	private static String topic;
	
	@Value("${kafka.topic_1}")
	private void setTopic(String topic) {
		this.topic = topic;
	}
	
	
		
	@GetMapping("/producer/{input}")
	public String producer(@PathVariable("input") String input) {
		this.kafkaTemplate.send(topic, input);		
		return input;
	}
	
	@GetMapping("/test")
	public String testMe() {
		System.out.println(topic);		
		return topic;
	}
	
	
	
	
	
}







































