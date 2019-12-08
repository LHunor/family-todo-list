package hu.elte.FamilyTodoList.controllers;

import hu.elte.FamilyTodoList.entities.Group;
import hu.elte.FamilyTodoList.entities.User;
import hu.elte.FamilyTodoList.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupRepository groupRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Group>> getAll() {
        return ResponseEntity.ok(groupRepository.findAll());
    }

    @GetMapping("/{id}/members")
    public ResponseEntity<Iterable<User>> users(@PathVariable Integer id) {
        Optional<Group> oGroup = groupRepository.findById(id);
        if (oGroup.isPresent()) {
            return ResponseEntity.ok(oGroup.get().getMembers());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
