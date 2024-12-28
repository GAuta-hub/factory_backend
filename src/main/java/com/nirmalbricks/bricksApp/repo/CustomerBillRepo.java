package com.nirmalbricks.bricksApp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nirmalbricks.bricksApp.model.CustomerBill;

@Repository
public interface CustomerBillRepo extends JpaRepository<CustomerBill, Integer>{

	@Query(nativeQuery = true,value="select * from customerbill")
	Optional<List<CustomerBill>> getallCustomerbill();
	
	@Modifying
	@Query(nativeQuery = true,value="delete from customerbill where customer_bill_id=?1")
	void deleteCustomerBillDetails(int customer_Bill_id);

	
	@Modifying
	@Query(nativeQuery = true,value="update customerbill set quantity=?1,rate=?2 where customer_bill_id=?3")
	void updatecustomerDetails(int quantity, int rate,int customer_bill_id);
}
