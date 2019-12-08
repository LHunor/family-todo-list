package hu.elte.FamilyTodoList.controllers;

import hu.elte.FamilyTodoList.entities.Stage;
import hu.elte.FamilyTodoList.repositories.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/stages")
public class StageController {

    @Autowired
    private StageRepository stageRepository;

    /* get all stages */
    @GetMapping("")
    public ResponseEntity<Iterable<Stage>> getAll() {
        return ResponseEntity.ok(stageRepository.findAll());
    }

    /* get stage by id */
    @GetMapping("/{id}")
    public ResponseEntity<Stage> get(@PathVariable Integer id) {
        Optional<Stage> stage = stageRepository.findById(id);
        return stage.isPresent() ? ResponseEntity.ok(stage.get()) : ResponseEntity.notFound().build();
    }

    /* create new stage */
    @PostMapping("")
    public ResponseEntity<Stage> post(@RequestBody Stage stage) {
        Stage savedStage = stageRepository.save(stage);
        return ResponseEntity.ok(savedStage);
    }

    /* edit stage (referred by id) */
    @PutMapping("/{id}")
    public ResponseEntity<Stage> put(@RequestBody Stage stage, @PathVariable Integer id) {
        Optional<Stage> oStage = stageRepository.findById(id);
        if (!oStage.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        stage.setId(id);
        return ResponseEntity.ok(stageRepository.save(stage));
    }

    /* delete stage (referred by id) */
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Stage> oStage = stageRepository.findById(id);
        if (!oStage.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        stageRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
