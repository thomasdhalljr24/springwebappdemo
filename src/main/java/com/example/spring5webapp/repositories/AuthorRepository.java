package com.example.spring5webapp.repositories;

import com.example.spring5webapp.dom.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
