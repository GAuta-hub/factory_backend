package com.nirmalbricks.bricksApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="workers")
public class Workers {
	@Id
	public int worker_id;
	public String worker_name;
	public String designation;
	public int salary;
	public int date_of_joining;
	public int getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(int worker_id) {
		this.worker_id = worker_id;
	}
	public String getWorker_name() {
		return worker_name;
	}
	public void setWorker_name(String worker_name) {
		this.worker_name = worker_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(int date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	
}
