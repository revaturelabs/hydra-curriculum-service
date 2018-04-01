package com.revature.hydra.curriculum.repo;

import com.revature.hydra.curriculum.model.Curriculum;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurriculumRepository extends ActivatableObjectRepository<Curriculum, Integer> {

    List<Curriculum> findByActiveIsTrueAndCoreIsTrue();

    List<Curriculum> findByActiveIsTrueAndCoreIsFalse();

    List<Curriculum> findByCoreIsTrue();

    List<Curriculum> findByCoreIsFalse();
}
