package hu.elte.FamilyTodoList.repositories;

import hu.elte.FamilyTodoList.entities.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends CrudRepository<Issue, Integer> {
}
