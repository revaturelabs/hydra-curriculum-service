package com.revature.hydra.curriculum.service;

import com.revature.beans.Curriculum;

import com.revature.hydra.curriculum.data.CurriculumRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CurriculumDaoService extends ActivatableObjectDaoService<Curriculum, Integer> {

    @Autowired
    protected CurriculumRepository repo;

    public List<Curriculum> getAllActiveCore() { return repo.findByActiveIsTrueAndCoreIsTrue(); }

    public List<Curriculum> getAllActiveFocus() { return repo.findByActiveIsTrueAndCoreIsFalse(); }

    public List<Curriculum> getAllCore() { return repo.findByCoreIsTrue(); }

    public List<Curriculum> getAllFocus() { return repo.findByCoreIsFalse(); }
}
