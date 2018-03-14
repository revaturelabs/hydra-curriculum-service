package com.revature.hydra.curriculum.service;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.revature.beans.Curriculum;

public class CurriculumRepositoryMessagingService {
	@Autowired
	private CurriculumRepositoryDispatcher requestDispatcher;
	
	@RabbitListener(queues = "revature.hydra.repos.curriculum")
	public Curriculum receiveSingleCurriculumRequest(String message) {
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		return requestDispatcher.processCurriculumRequest(request);
	}
	
	@RabbitListener(queues = "revature.hydra.repos.curriculum.list")
	public List<Curriculum> receiveListSimpleCategoryRequest(String message) {
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		
		return requestDispatcher.processListCurriculumRequest(request);
	}

}
