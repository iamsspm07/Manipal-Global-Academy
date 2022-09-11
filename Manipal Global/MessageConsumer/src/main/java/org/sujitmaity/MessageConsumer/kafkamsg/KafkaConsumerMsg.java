package org.sujitmaity.MessageConsumer.kafkamsg;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerMsg {
	@KafkaListener(topics="netsurfingzone-topic-1",groupId="lob")
	public void listeningMessage(String message) {
		System.out.println("-------------------------------");
		System.out.println("Kafka Message: "+message);
	}

}
