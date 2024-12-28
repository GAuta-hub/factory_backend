package com.nirmalbricks.bricksApp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nirmalbricks.bricksApp.model.Salary;
@Repository
public interface SalaryRepo extends JpaRepository<Salary, Integer>{
	
	@Query(nativeQuery = true,value="select * from salary")
	Optional<List<Salary>> getallSalary();
	
	@Modifying
	@Query(nativeQuery = true,value="delete from salary where serial_number=?1")
	void deleteSalaryDetails(int serial_number);

	
	@Modifying
	@Query(nativeQuery = true,value="update salary set total_salary=?1,remaining_salary=?2 where serial_number=?3")
	void updatesalaryDetails(int total_salary, int remaining_salary,int serial_number);
}
