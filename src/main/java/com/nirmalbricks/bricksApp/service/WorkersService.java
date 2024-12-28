package com.nirmalbricks.bricksApp.service;

import java.util.List;

import com.nirmalbricks.bricksApp.model.Workers;

public interface WorkersService {

	public List<Workers> getWorkers();
	
	public void addWorkers(Workers workers);
}
