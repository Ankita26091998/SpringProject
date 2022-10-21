package com.spring.core.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.core.mapping.entity.Trainer;
import com.spring.core.mapping.exception.TrainerNotFoundException;
import com.spring.core.mapping.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

	@Autowired
	private TrainerService trainerService;

	@PostMapping("/add")
	public Trainer createTrainer(@RequestBody Trainer trainer) {
		return trainerService.addTrainer(trainer);
	}

	@GetMapping("/trainers")
	public List<Trainer> getAllTrainers() {
		return trainerService.getTrainers();
	}

	@GetMapping("/trainers/{id}")
	public Trainer getTrainerById(@PathVariable int id) throws TrainerNotFoundException {
		return trainerService.getTrainerById(id);
	}

	@PutMapping("/update/{id}")
	public Trainer updateTrainer(@RequestBody Trainer trainer) {
		return trainerService.updateTrainer(trainer);
	}

	@DeleteMapping("/{id}")
	public String deleteTrainer(@PathVariable int id) {
		trainerService.deleteTrainer(id);
		return "Trainer deleted Successfully";

	}

}
