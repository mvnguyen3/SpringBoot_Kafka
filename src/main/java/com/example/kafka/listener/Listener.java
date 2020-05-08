package com.example.kafka.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
	
//	@KafkaListener(topics = "${kafka.topic}", groupId = "groupID1")
//	public void kafkaListener(String input) {
//		System.out.println(input);
//	}
}
