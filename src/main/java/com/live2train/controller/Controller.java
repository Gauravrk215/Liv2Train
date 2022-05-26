package com.live2train.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.live2train.models.Models;
import com.live2train.service.TrainingCenterService;

@RestController
public class Controller {
	
	@Autowired
	TrainingCenterService trainingCenterService;
	
	@PostMapping("/savedetails")  // For save the details in database.
	public Models savedetails(@Valid @RequestBody Models models) {
		Models mod = trainingCenterService.savedetails(models);
		return mod;
	}
	// Implement
		
	
	
		@GetMapping("/getdetails") // Get data from database.
		public List<Models> getdetails(){
			List<Models>  mod = trainingCenterService.getdetails();
			return mod;
		}
		// Implement
		
	}


