package org.sujitmaity.MessageProducer.messagecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sujitmaity.MessageProducer.model.Employee;

@RestController
@RequestMapping("api")
public class MessageController {
	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	
	@GetMapping("/msg/{Everything}")
	public void sendMsg(@RequestParam("Everything") String message) {
		Employee message1=new Employee(10,"Sujit");
		kafkaTemplate.send("netsurfingzone-topic-1",message1);
	}

}
