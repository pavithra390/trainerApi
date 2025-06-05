package com.example.trainerapi.controller;
import com.example.trainerapi.entity.Trainer;
import com.example.trainerapi.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/gym")
public class TrainerController {
    @Autowired
    TrainerService ts;
    @PostMapping("/assign/trainer")
    public String assignTrainer(@RequestBody Trainer t) {
        ts.assignTrainer(t);
        return "Trainer added successfully";
    }
    @GetMapping("/get/trainer/{trainer_id}")
    public Optional<Trainer> getTrainer(@PathVariable("trainer_id") Long id) {
        return ts.getTrainerById(id);
    }
    @GetMapping("/get/all/trainers")
    public Iterable<Trainer> getAllTrainers() {
        return ts.getAllTrainers();
    }
}
