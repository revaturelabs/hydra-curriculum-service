package com.revature.hydra.curriculum.repo;

import com.revature.hydra.curriculum.model.Curriculum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CurriculumRepo extends JpaRepository<Curriculum, Integer> {
}