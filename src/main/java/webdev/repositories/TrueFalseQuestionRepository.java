package webdev.repositories;

import org.springframework.data.repository.CrudRepository;

import webdev.models.TrueFalseQuestion;

public interface TrueFalseQuestionRepository
	extends CrudRepository<TrueFalseQuestion, Integer> {
	
}