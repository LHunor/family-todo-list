package hu.elte.FamilyTodoList.repositories;

import hu.elte.FamilyTodoList.entities.RestrictionType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestrictionTypeRepository extends CrudRepository<RestrictionType, Integer> {
}
