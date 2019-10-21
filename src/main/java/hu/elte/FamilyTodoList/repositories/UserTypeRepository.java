package hu.elte.FamilyTodoList.repositories;

import hu.elte.FamilyTodoList.entities.UserType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends CrudRepository<UserType, Integer> {

}
