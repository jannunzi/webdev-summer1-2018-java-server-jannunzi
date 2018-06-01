package webdev.repositories;

import org.springframework.data.repository.CrudRepository;

import webdev.models.Exam;
import webdev.models.Widget;

public interface ExamRepository
extends CrudRepository<Exam, Integer>{

}
