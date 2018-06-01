package webdev.repositories;

import org.springframework.data.repository.CrudRepository;

import webdev.models.Lesson;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {

}
