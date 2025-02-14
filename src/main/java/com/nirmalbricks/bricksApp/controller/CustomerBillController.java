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

import com.nirmalbricks.bricksApp.model.CustomerBill;
import com.nirmalbricks.bricksApp.service.CustomerBillService;


@CrossOrigin(origins = "*")
@RestController
public class CustomerBillController {
	
	@Autowired
	CustomerBillService customerBillService;
	
	@GetMapping("/getcustomerbilldetails")
		public Optional<List<CustomerBill>> getCustomerBillDetails(){
			return customerBillService.getCustomerBillsDetails();
		}
	
	 @PostMapping("/addnewuser")
	  public void addCustomerBill(@RequestBody CustomerBill customerBill) { 
		  
		   customerBillService.addCustomerBill(customerBill);
	  
	  }
	  
	  @DeleteMapping("/deleteuser") 
	  public void deleteCustomerBillDetails(@RequestParam(value = "customer_bill_id") int customer_bill_id) { 
		 
		  customerBillService.deleteCustomerBillDetails(customer_bill_id);
		   }

	  
	  @PutMapping("/updateuser") 
	  public void deleteCustomerBillDetails(@RequestBody CustomerBill customerBill) { 
		  customerBillService.updateCustomerBillDetails(customerBill);
		   }
	  
	  



}
