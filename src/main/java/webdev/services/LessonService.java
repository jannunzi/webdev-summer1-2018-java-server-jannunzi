package webdev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import webdev.models.Lesson;
import webdev.models.Module;
import webdev.models.Widget;
import webdev.repositories.LessonRepository;
import webdev.repositories.ModuleRepository;
import webdev.repositories.WidgetRepository;

@RestController
@CrossOrigin(origins = "*")
public class LessonService {
	@Autowired
	LessonRepository lessonRepository;
	@Autowired
	ModuleRepository moduleRepository;
	
	@GetMapping("/api/lesson")
	public List<Lesson> findAllLessons() {
		return (List<Lesson>) lessonRepository.findAll();
	}
	
	@GetMapping("/api/course/{cid}/module/{mid}/lesson")
	public List<Lesson> findForModule(@PathVariable(name="mid") int moduleId) {
		Optional<Module> optionalModule = moduleRepository.findById(moduleId);
		if(optionalModule.isPresent()) {
			Module module = optionalModule.get();
			return (List<Lesson>) module.getLessons();
		}
		return null;
	}
}
