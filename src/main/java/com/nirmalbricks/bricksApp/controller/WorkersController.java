package com.nirmalbricks.bricksApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nirmalbricks.bricksApp.model.Workers;
import com.nirmalbricks.bricksApp.service.WorkersService;

@RestController
@CrossOrigin(origins = "*")
public class WorkersController {
	
	@Autowired
	WorkersService workersService;
	
	@GetMapping("/getworkersdetails")
	public List<Workers> getWorkersDetails(){
		return workersService.getWorkers();
	}

	@PostMapping("/addworkersdetails")
	public void addWorkers(@RequestBody Workers workers) {
		workersService.addWorkers(workers);
	}






}
