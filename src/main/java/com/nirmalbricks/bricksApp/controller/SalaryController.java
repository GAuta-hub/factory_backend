package com.nirmalbricks.bricksApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nirmalbricks.bricksApp.model.Salary;
import com.nirmalbricks.bricksApp.service.SalaryService;

@RestController
@CrossOrigin(origins = "*")
public class SalaryController {
	@Autowired
	SalaryService salaryService;
	
	@GetMapping("/getsalerydetails")
	public Optional<List<Salary>> getSalaryDetails(){
		return salaryService.getSalaryDetails();
	}
	
	@PostMapping("/addsalarydetails")
	public void addaddSalarySalary(@RequestBody Salary salary) {
		salaryService.addSalary(salary);
	}
	
	@DeleteMapping("/deletesalarydetails")
	public void deleteSalary(@RequestParam(name="salary") int salary) {
		salaryService.deleteSalaryDetails(salary);
	}
	
	@PutMapping("/updatesalarydetails")
	public void updateSalary(@RequestBody Salary salary) {
		salaryService.updateSalaryDetails(salary);
	}
}
