package hu.elte.FamilyTodoList.repositories;

import hu.elte.FamilyTodoList.entities.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends CrudRepository<Group, Integer> {
}
