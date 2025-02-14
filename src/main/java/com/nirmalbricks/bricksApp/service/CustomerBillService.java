package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import com.nirmalbricks.bricksApp.model.CustomerBill;

public interface CustomerBillService {
	
	public Optional< List<CustomerBill>> getCustomerBillsDetails();
	
	public void addCustomerBill(CustomerBill customerBill);

	public void deleteCustomerBillDetails(int customer_bill_id);

	public void updateCustomerBillDetails(CustomerBill customerBill);
}
