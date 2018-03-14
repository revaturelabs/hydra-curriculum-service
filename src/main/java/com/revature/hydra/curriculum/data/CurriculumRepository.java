package com.revature.hydra.curriculum.data;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.revature.beans.Curriculum;

@Repository
public interface CurriculumRepository extends ActivatableObjectRepository<Curriculum, Integer> {

    List<Curriculum> findByActiveIsTrueAndCoreIsTrue();

    List<Curriculum> findByActiveIsTrueAndCoreIsFalse();

    List<Curriculum> findByCoreIsTrue();

    List<Curriculum> findByCoreIsFalse();
}
