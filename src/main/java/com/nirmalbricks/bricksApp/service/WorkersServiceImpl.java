package com.nirmalbricks.bricksApp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmalbricks.bricksApp.model.Workers;
import com.nirmalbricks.bricksApp.repo.WorkersRepo;

@Service
public class WorkersServiceImpl implements WorkersService{

	@Autowired
	WorkersRepo workersRepo;
	
	@Override
	public List<Workers> getWorkers() {
		// TODO Auto-generated method stub
		return workersRepo.findAll();
	}

	@Override
	public void addWorkers(Workers workers) {
		// TODO Auto-generated method stub
		workersRepo.save(workers);
	}
	

}
