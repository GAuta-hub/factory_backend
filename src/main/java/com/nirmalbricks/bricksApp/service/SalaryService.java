package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import com.nirmalbricks.bricksApp.model.Salary;

public interface SalaryService {
	
	public Optional< List<Salary>> getSalaryDetails();
	
	public void addSalary(Salary salary);

	public void deleteSalaryDetails(int serial_number);

	public void updateSalaryDetails(Salary salary);
}
