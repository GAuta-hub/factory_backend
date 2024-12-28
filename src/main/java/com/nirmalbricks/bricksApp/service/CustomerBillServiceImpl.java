package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmalbricks.bricksApp.model.CustomerBill;
import com.nirmalbricks.bricksApp.repo.CustomerBillRepo;

import jakarta.transaction.Transactional;

@Service
public class CustomerBillServiceImpl implements CustomerBillService{
	
	@Autowired
	CustomerBillRepo customerBillRepo;
	
	@Override
	public Optional< List<CustomerBill>> getCustomerBillsDetails() {
		// TODO Auto-generated method stub
		return customerBillRepo.getallCustomerbill();
	}

	@Override
	public void addCustomerBill(CustomerBill customerBill) {
		// TODO Auto-generated method stub
		customerBillRepo.save(customerBill);
	}

	@Override
	@Transactional
	public void deleteCustomerBillDetails(int customer_id) {
		// TODO Auto-generated method stub
		customerBillRepo.deleteCustomerBillDetails(customer_id);
	}

	@Override
	public void updateCustomerBillDetails(CustomerBill customerBill) {
		
		customerBillRepo.updatecustomerDetails(customerBill.getQuantity(),customerBill.getRate(),customerBill.getCustomer_bill_id());
	}

}
