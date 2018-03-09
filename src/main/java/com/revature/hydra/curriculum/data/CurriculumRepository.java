package com.revature.hydra.curriculum.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.beans.Curriculum;

import java.util.List;

@Repository
public interface CurriculumRepository extends ActivatableObjectRepository<Curriculum, Integer> {

    List<Curriculum> findByActiveIsTrueAndCoreIsTrue();

    List<Curriculum> findByActiveIsTrueAndCoreIsFalse();

    List<Curriculum> findByCoreIsTrue();

    List<Curriculum> findByCoreIsFalse();
}
