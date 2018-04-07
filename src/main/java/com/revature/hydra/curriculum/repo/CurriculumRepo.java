package com.revature.hydra.curriculum.repo;

import com.revature.hydra.curriculum.model.Curriculum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CurriculumRepo extends CrudRepository<Curriculum, Integer> {
}