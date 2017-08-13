package com.FirstSpringBoot.FirstSpringBoot.Repo;

import org.springframework.data.repository.CrudRepository;

import com.FirstSpringBoot.FirstSpringBoot.Model.Author;

public interface AuthorRepo extends CrudRepository <Author,Long>{

}
