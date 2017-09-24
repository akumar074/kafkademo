package com.immortal.jpademo.producer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class KafkaProducerController {
	
	@Autowired
	Publisher publisher;
	
	@RequestMapping(path="",method=RequestMethod.POST)
	public ResponseEntity<Map<String,String>> sendMessage(@RequestBody KafkaMessage message){
		publisher.publishMessage(message);
		Map<String, String> map=new HashMap<>();
		map.put("status","Message Sent Successfully");
		return new ResponseEntity<Map<String,String>>(map,HttpStatus.OK);
	}
}
