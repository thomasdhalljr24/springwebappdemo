package com.example.spring5webapp.repositories;

import com.example.spring5webapp.dom.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
