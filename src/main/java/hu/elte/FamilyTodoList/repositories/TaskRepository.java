package hu.elte.FamilyTodoList.repositories;

import hu.elte.FamilyTodoList.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
