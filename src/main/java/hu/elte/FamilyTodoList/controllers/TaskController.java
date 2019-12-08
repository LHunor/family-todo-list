package hu.elte.FamilyTodoList.controllers;

import hu.elte.FamilyTodoList.entities.Tag;
import hu.elte.FamilyTodoList.entities.Task;
import hu.elte.FamilyTodoList.entities.User;
import hu.elte.FamilyTodoList.repositories.TagRepository;
import hu.elte.FamilyTodoList.repositories.TaskRepository;
import hu.elte.FamilyTodoList.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Task>> getAll() {
        return ResponseEntity.ok(taskRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> get(@PathVariable Integer id) {
        Optional<Task> task = taskRepository.findById(id);
        if (!task.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task.get());
    }

    @PostMapping("")
    public ResponseEntity<Task> post(@RequestBody Task task) {
        Task newTask = taskRepository.save(task);
        return ResponseEntity.ok(newTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Task> task = taskRepository.findById(id);
        if (!task.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        taskRepository.delete(task.get());
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> put(@PathVariable Integer id, @RequestBody Task task) {
        Optional<Task> oldTask = taskRepository.findById(id);
        if (!oldTask.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        task.setId(id);
        return ResponseEntity.ok(taskRepository.save(task));
    }

    // ******************* TAGS *******************
    @GetMapping("/{id}/tags")
    public ResponseEntity<Iterable<Tag>> tags(@PathVariable Integer id) {
        Optional<Task> oTask = taskRepository.findById(id);
        if (oTask.isPresent()) {
            return ResponseEntity.ok(oTask.get().getTags());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{id}/tags")
    public ResponseEntity<Tag> insertTag(@PathVariable Integer id, @RequestBody Tag tag) {
        Optional<Task> oTask = taskRepository.findById(id);
        if (oTask.isPresent()) {
            Task task = oTask.get();
            Tag newTag = tagRepository.save(tag);
            task.getTags().add(newTag);
            taskRepository.save(task); // comment from sample project: have to trigger from the @JoinTable side
            return ResponseEntity.ok(newTag);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}/tags")
    public ResponseEntity<Iterable<Tag>> modifyTags(@PathVariable Integer id, @RequestBody List<Tag> tags) {
        Optional<Task> oTask = taskRepository.findById(id);
        if (oTask.isPresent()) {
            Task task = oTask.get();

            // if we would like to add new tags as well
            for (Tag tag : tags) {
                if (tag.getId() == null) {
                    tagRepository.save(tag);
                }
            }

            task.setTags(tags);
            taskRepository.save(task);
            return ResponseEntity.ok(tags);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // ******************* ENDTAGS *******************

    // ******************* ASSIGNED USERS ************

    @GetMapping("/{id}/users")
    public ResponseEntity<Iterable<User>> users(@PathVariable Integer id) {
        Optional<Task> oTask = taskRepository.findById(id);
        if (oTask.isPresent()) {
            return ResponseEntity.ok(oTask.get().getAssignedUsers());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
