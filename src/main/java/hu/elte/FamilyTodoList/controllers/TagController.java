package hu.elte.FamilyTodoList.controllers;


import hu.elte.FamilyTodoList.entities.Tag;
import hu.elte.FamilyTodoList.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    private TagRepository tagRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Tag>> getAll() {
        return ResponseEntity.ok(tagRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tag> get(@PathVariable Integer id) {
        Optional<Tag> tag = tagRepository.findById(id);
        if (tag.isPresent()) {
            return ResponseEntity.ok(tag.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Tag> post(@RequestBody Tag tag) {
        Tag savedTag = tagRepository.save(tag);
        return ResponseEntity.ok(savedTag);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tag> put(@RequestBody Tag tag, @PathVariable Integer id) {
        Optional<Tag> oTag = tagRepository.findById(id);
        if (oTag.isPresent()) {
            tag.setId(id);
            return ResponseEntity.ok(tagRepository.save(tag));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Tag> oTag = tagRepository.findById(id);
        if (oTag.isPresent()) {
            tagRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
