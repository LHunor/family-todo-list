package hu.elte.FamilyTodoList.controllers;

import hu.elte.FamilyTodoList.entities.RestrictionType;
import hu.elte.FamilyTodoList.repositories.RestrictionTypeRepository;
import hu.elte.FamilyTodoList.repositories.TaskRepository;
import hu.elte.FamilyTodoList.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/restriction-types")
public class RestrictionTypeController {
    @Autowired
    private RestrictionTypeRepository restrictionTypeRepository;

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<RestrictionType>> getAll() {
        return ResponseEntity.ok(restrictionTypeRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestrictionType> get(@PathVariable Integer id) {
        Optional<RestrictionType> oRestrictionType = restrictionTypeRepository.findById(id);
        if (!oRestrictionType.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oRestrictionType.get());
    }
}
