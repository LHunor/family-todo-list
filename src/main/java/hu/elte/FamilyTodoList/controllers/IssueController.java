package hu.elte.FamilyTodoList.controllers;

import hu.elte.FamilyTodoList.entities.Issue;
import hu.elte.FamilyTodoList.repositories.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/issues")
public class IssueController {

    @Autowired
    private IssueRepository issueRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Issue>> getAll() {
        return ResponseEntity.ok(issueRepository.findAll());
    }
}

