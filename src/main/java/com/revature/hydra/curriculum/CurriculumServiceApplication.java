package com.revature.hydra.curriculum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.hydra.curriculum.controller.CurriculumCtrl;

/*
@SpringBootApplication(scanBasePackages = {"com.revature.hydra.curriculum",
		"com.revature.assignforcecommon.security"},
		exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
*/
@SpringBootApplication(scanBasePackages = {"com.revature.hydra"},
	exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@RestController
@EnableDiscoveryClient
@EntityScan("com.revature.beans")
public class CurriculumServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurriculumServiceApplication.class, args);
	}

	@RequestMapping("/test")
	public String testMsg(){
		return "test message";
	}
}
