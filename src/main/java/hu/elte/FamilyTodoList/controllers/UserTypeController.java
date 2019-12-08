package hu.elte.FamilyTodoList.controllers;

import hu.elte.FamilyTodoList.entities.Issue;
import hu.elte.FamilyTodoList.entities.User;
import hu.elte.FamilyTodoList.entities.UserType;
import hu.elte.FamilyTodoList.repositories.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/user-types")
public class UserTypeController {
    @Autowired
    private UserTypeRepository userTypeRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<UserType>> getAll() {
        return ResponseEntity.ok(userTypeRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserType> get(@PathVariable Integer id) {
        Optional<UserType> oUserType = userTypeRepository.findById(id);
        if (!oUserType.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oUserType.get());
    }

    @GetMapping("/{id}/users")
    public ResponseEntity<Iterable<User>> users(@PathVariable Integer id) {
        Optional<UserType> oUserType = userTypeRepository.findById(id);
        if (oUserType.isPresent()) {
            return ResponseEntity.ok(oUserType.get().getUsers());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

