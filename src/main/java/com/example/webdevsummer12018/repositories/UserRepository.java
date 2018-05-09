package com.example.webdevsummer12018.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.webdevsummer12018.models.User;

public interface UserRepository
	extends CrudRepository<User, Integer>{

}
