package com.nirmalbricks.bricksApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stockavailable")
public class StockAvailable {
	@Id
	public Integer serial_number;
	public String stock_name;
	public String date;
	public Integer incoming;
	public Integer outgoing;
	public Integer balance;
	public Integer getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(Integer serial_number) {
		this.serial_number = serial_number;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getIncoming() {
		return incoming;
	}
	public void setIncoming(Integer incoming) {
		this.incoming = incoming;
	}
	public Integer getOutgoing() {
		return outgoing;
	}
	public void setOutgoing(Integer outgoing) {
		this.outgoing = outgoing;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
}
