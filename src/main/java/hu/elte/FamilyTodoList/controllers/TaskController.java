package hu.elte.FamilyTodoList.controllers;

import hu.elte.FamilyTodoList.entities.Task;
import hu.elte.FamilyTodoList.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("tasks")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Task>> getAll() {
        return ResponseEntity.ok(taskRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> get(@PathVariable Integer id) {
        Optional<Task> task = taskRepository.findById(id);
        if (!task.isPresent()) { ResponseEntity.notFound(); }
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
            ResponseEntity.notFound();
        }
        taskRepository.delete(task.get());
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> put(@PathVariable Integer id, @RequestBody Task task) {
        Optional<Task> oldTask = taskRepository.findById(id);
        if (!oldTask.isPresent()) {
            ResponseEntity.notFound();
        }
        task.setId(id);
        return ResponseEntity.ok(taskRepository.save(task));
    }
}
