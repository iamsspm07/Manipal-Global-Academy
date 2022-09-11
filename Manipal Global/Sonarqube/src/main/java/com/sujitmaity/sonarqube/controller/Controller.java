package com.sujitmaity.sonarqube.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getData(){
		if("tset"==null) {
			System.out.println("Calling Test Null");
		}
		return ResponseEntity.ok("Controller Example");
		
	}

}
