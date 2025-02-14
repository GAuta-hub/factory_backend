package com.nirmalbricks.bricksApp.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="salary")
public class Salary {
	@Id
	public int serial_number;
	public String worker_name;
	public Date date;
	public int total_salary;
	public int advances;
	public int salary_paid;
	public int remaining_salary;
	public int getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(int serial_number) {
		this.serial_number = serial_number;
	}
	public String getWorker_name() {
		return worker_name;
	}
	public void setWorker_name(String worker_name) {
		this.worker_name = worker_name;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotal_salary() {
		return total_salary;
	}
	public void setTotal_salary(int total_salary) {
		this.total_salary = total_salary;
	}
	public int getAdvances() {
		return advances;
	}
	public void setAdvances(int advances) {
		this.advances = advances;
	}
	public int getSalary_paid() {
		return salary_paid;
	}
	public void setSalary_paid(int salary_paid) {
		this.salary_paid = salary_paid;
	}
	public int getRemaining_salary() {
		return remaining_salary;
	}
	public void setRemaining_salary(int remaining_salary) {
		this.remaining_salary = remaining_salary;
	}

}
