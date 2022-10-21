package com.spring.core.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.core.mapping.entity.Trainer;
import com.spring.core.mapping.exception.TrainerNotFoundException;
import com.spring.core.mapping.repository.TrainerRepository;

@Service
public class TrainerService {

	@Autowired
	private TrainerRepository trainerRepository;

	public Trainer addTrainer(Trainer trainer) {
		return trainerRepository.save(trainer);
	}

	public List<Trainer> getTrainers() {
		return trainerRepository.findAll();

	}

	public Trainer getTrainerById(int id) throws TrainerNotFoundException {
		Trainer t = trainerRepository.findById(id).get();
		if (t == null) {
			throw new TrainerNotFoundException();
		}
		return t;
	}

	public Trainer updateTrainer(Trainer trainer) {
		return trainerRepository.save(trainer);
	}

	public void deleteTrainer(int id) {
		Trainer t = new Trainer();
		t.setTrainerId(id);
		trainerRepository.delete(t);
	}

}
