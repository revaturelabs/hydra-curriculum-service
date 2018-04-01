package com.revature.hydra.curriculum.service;

import com.revature.hydra.curriculum.domain.Activatable;
import com.revature.hydra.curriculum.repo.ActivatableObjectRepository;
import com.revature.hydra.curriculum.repo.BaseRepository;
import com.revature.hydra.curriculum.repo.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public abstract class DaoService<T, ID extends Serializable>{

	@Autowired
	protected BaseRepository<T, ID> repo;

	public T saveItem(T persisted) { return repo.save(persisted); }

	public T getOneItem(ID id) {
		return repo.findOne(id);
	}

	public void deleteItem(ID id){
		repo.delete(id);
	}

	public List<T> getAllItems() {
		return (List<T>) repo.findAll();
	}
}
