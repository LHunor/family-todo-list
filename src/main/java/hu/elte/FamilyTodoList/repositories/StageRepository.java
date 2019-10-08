package hu.elte.FamilyTodoList.repositories;

import hu.elte.FamilyTodoList.entities.Stage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends CrudRepository<Stage, Integer> {

}