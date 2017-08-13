package com.FirstSpringBoot.FirstSpringBoot.Repo;

import org.springframework.data.repository.CrudRepository;

import com.FirstSpringBoot.FirstSpringBoot.Model.Publisher;

public interface PublisherRepo extends CrudRepository <Publisher,Long>  {

}
