package com.live2train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.live2train.models.Models;
import com.live2train.repository.TrainingCenterRepository;

@Service
public class TrainingCenterService {

	@Autowired
	TrainingCenterRepository trainingCenterRepository;

	public Models savedetails(Models models) {
		return trainingCenterRepository.save(models);
	}

	public List<Models> getdetails() {
		return (List<Models>) trainingCenterRepository.findAll();//finds all the training center information
	}
}
