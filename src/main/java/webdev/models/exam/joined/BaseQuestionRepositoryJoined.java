package webdev.models.exam.joined;

import org.springframework.data.repository.CrudRepository;

public interface BaseQuestionRepositoryJoined
	extends CrudRepository<BaseQuestionJoined, Integer>{
}