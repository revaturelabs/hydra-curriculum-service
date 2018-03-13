package com.revature.hydra.curriculum.service;

import java.lang.reflect.Type;
import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.revature.beans.Curriculum;

public class CurriculumRepositoryMessagingService {
	
	@RabbitListener(queues = "revature.hydra.repos.curriculum")
	public Curriculum receiveSingleCurriculumRequest(String message) {
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		Curriculum curr = new Gson().fromJson(request, Curriculum.class);
		return curr;
	}
	
	@RabbitListener(queues = "revature.hydra.repos.curriculum.list")
	public List<Curriculum> receiveListSimpleCategoryRequest(String message) {
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		Type listType = new TypeToken<List<Curriculum>>() {}.getType();
		List<Curriculum> currList = new Gson().fromJson(request, listType);
		
		return currList;
	}

}
