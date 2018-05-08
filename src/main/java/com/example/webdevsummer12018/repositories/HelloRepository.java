package com.example.webdevsummer12018.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.webdevsummer12018.models.Hello;

public interface HelloRepository
	extends CrudRepository<Hello, Integer> {
}
