package com.revature.hydra.curriculum.repo;

import com.revature.hydra.curriculum.model.SkillId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillIdRepo extends CrudRepository<SkillId, Integer> {
}
