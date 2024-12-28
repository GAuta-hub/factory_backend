package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmalbricks.bricksApp.model.Salary;
import com.nirmalbricks.bricksApp.repo.SalaryRepo;

@Service
public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
	SalaryRepo salaryRepo;
	
	@Override
	public Optional<List<Salary>> getSalaryDetails() {
		// TODO Auto-generated method stub
		return salaryRepo.getallSalary();
	}

	@Override
	public void addSalary(Salary salary) {
		// TODO Auto-generated method stub
		salaryRepo.save(salary);
	}

	@Override
	public void deleteSalaryDetails(int serial_number) {
		// TODO Auto-generated method stub
		salaryRepo.deleteSalaryDetails(serial_number);
	}

	@Override
	public void updateSalaryDetails(Salary salary) {
		// TODO Auto-generated method stub
		salaryRepo.updatesalaryDetails(salary.getTotal_salary(),salary.getRemaining_salary(),salary.getSerial_number());
	}

}
