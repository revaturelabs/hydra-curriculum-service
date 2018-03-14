package com.revature.hydra.curriculum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.revature.beans.Curriculum;
import com.revature.hydra.curriculum.data.CurriculumRepository;

@Service
public class CurriculumRepositoryDispatcher {
	@Autowired
	CurriculumDaoService dao;
	CurriculumRepository repo;
	
	public Curriculum processCurriculumRequest(JsonObject request) {
		String methodName = request.get("methodName").getAsString();
		Curriculum result = null;
		if (methodName.equals("findByActiveIsTrueAndCoreIsTrue")) {
			result = dao.getOneItem(request.get("curriculumId").getAsInt());
		}
		return result;
	}
	public List<Curriculum> processListCurriculumRequest(JsonObject request) {
		List<Curriculum> result = null;
		String methodName = request.get("methodName").getAsString();

		if (methodName.equals("findByActiveIsTrueAndCoreIsTrue")) {
			result = repo.findByActiveIsTrueAndCoreIsTrue();
		}
		else if (methodName.equals("findByActiveIsTrueAndCoreIsFalse")) {
			result = repo.findByActiveIsTrueAndCoreIsFalse();
		}
		else if (methodName.equals("findByCoreIsTrue")) {
			result = repo.findByCoreIsTrue();
		}
		else if (methodName.equals("findByCoreIsFalse")) {
			result = repo.findByCoreIsFalse();
		}

		return result;
	}

}
