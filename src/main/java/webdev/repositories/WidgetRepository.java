package webdev.repositories;

import org.springframework.data.repository.CrudRepository;

import webdev.models.Widget;

public interface WidgetRepository
extends CrudRepository<Widget, Integer>{

}
