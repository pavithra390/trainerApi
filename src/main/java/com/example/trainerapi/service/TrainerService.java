package com.example.trainerapi.service;
import com.example.trainerapi.entity.Trainer;
import com.example.trainerapi.repo.TrainerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class TrainerService {
    @Autowired
    TrainerRepo tr;
    public void assignTrainer(Trainer t) {
        tr.save(t);
    }
    public Optional<Trainer> getTrainerById(Long id) {
        return tr.findById(id);
    }
    public Iterable<Trainer> getAllTrainers() {
        return tr.findAll();
    }
}
