package hu.elte.FamilyTodoList.repositories;

import hu.elte.FamilyTodoList.entities.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
