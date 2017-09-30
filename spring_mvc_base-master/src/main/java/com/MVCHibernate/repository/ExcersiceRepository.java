package com.MVCHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MVCHibernate.model.Exercise;
@Repository
public interface ExcersiceRepository extends JpaRepository<Exercise,Long>{
	
}
