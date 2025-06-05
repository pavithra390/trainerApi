package com.example.trainerapi.repo;
import com.example.trainerapi.entity.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TrainerRepo extends CrudRepository<Trainer, Long> {

}
