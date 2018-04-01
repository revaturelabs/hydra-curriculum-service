package com.revature.hydra.curriculum.repo;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

// @NoRepositoryBean
@Repository
public interface BaseRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {
}
