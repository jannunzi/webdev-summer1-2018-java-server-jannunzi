package webdev.repositories;

import org.springframework.data.repository.CrudRepository;

import webdev.models.Hello;

public interface HelloRepository
	extends CrudRepository<Hello, Integer> {
}
