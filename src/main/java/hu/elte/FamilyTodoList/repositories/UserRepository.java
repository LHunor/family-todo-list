package hu.elte.FamilyTodoList.repositories;

import hu.elte.FamilyTodoList.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
