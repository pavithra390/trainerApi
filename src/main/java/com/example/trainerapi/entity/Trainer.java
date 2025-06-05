package com.example.trainerapi.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table
@Entity
public class Trainer {
    @Id
    @Column
    Long trainerId;
    @Column
    Long userId;
    public Trainer(Long trainerId, Long userId) {
        this.trainerId = trainerId;
        this.userId = userId;
    }
    public Trainer(){}
    public Long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }



}
