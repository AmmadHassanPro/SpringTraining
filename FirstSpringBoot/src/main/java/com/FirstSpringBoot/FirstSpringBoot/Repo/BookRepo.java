package com.FirstSpringBoot.FirstSpringBoot.Repo;

import org.springframework.data.repository.CrudRepository;

import com.FirstSpringBoot.FirstSpringBoot.Model.Book;

public interface BookRepo extends CrudRepository <Book,Long> {

}
