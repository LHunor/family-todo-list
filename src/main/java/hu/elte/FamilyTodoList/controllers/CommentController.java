package hu.elte.FamilyTodoList.controllers;

import hu.elte.FamilyTodoList.entities.Comment;
import hu.elte.FamilyTodoList.entities.Issue;
import hu.elte.FamilyTodoList.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Comment>> getAll() {
        return ResponseEntity.ok(commentRepository.findAll());
    }
}
