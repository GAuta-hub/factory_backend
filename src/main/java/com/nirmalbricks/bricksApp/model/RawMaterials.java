package com.nirmalbricks.bricksApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rawmaterials")
public class RawMaterials {
	@Id
	public int rawmaterial_id;
	public String received_date;
	public String name_of_material;
	public int quantity;
	public int rate;
	public int total_amount;
	public int phone_number;
	public int invoice_number;
	public String address;
	public int getRawmaterial_id() {
		return rawmaterial_id;
	}
	public void setRawmaterial_id(int rawmaterial_id) {
		this.rawmaterial_id = rawmaterial_id;
	}
	public String getReceived_date() {
		return received_date;
	}
	public void setReceived_date(String received_date) {
		this.received_date = received_date;
	}
	public String getName_of_material() {
		return name_of_material;
	}
	public void setName_of_material(String name_of_material) {
		this.name_of_material = name_of_material;
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
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public int getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
