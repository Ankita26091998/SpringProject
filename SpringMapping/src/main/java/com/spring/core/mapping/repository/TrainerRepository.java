package com.spring.core.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.core.mapping.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

}
