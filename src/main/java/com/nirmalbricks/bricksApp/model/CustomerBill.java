package com.nirmalbricks.bricksApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerbill")
public class CustomerBill {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int customer_bill_id;
	public String customer_name;
	public String customer_address;
	public Long customer_phone_number;
	public String date;
	public int quantity;
	public int rate;
	public int total_amount;
	public int getCustomer_bill_id() {
		return customer_bill_id;
	}
	public void setCustomer_bill_id(int customer_bill_id) {
		this.customer_bill_id = customer_bill_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public Long getCustomer_phone_number() {
		return customer_phone_number;
	}
	public void setCustomer_phone_number(Long customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	
	
}
