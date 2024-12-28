package com.nirmalbricks.bricksApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {
	@Id
	public int material_id	;
	public String material_name;
	public String date;
	public int material_quantity_used;
	public int material_quantity_received;
	public int material_quantity_available;
	public int getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMaterial_quantity_used() {
		return material_quantity_used;
	}
	public void setMaterial_quantity_used(int material_quantity_used) {
		this.material_quantity_used = material_quantity_used;
	}
	public int getMaterial_quantity_received() {
		return material_quantity_received;
	}
	public void setMaterial_quantity_received(int material_quantity_received) {
		this.material_quantity_received = material_quantity_received;
	}
	public int getMaterial_quantity_available() {
		return material_quantity_available;
	}
	public void setMaterial_quantity_available(int material_quantity_available) {
		this.material_quantity_available = material_quantity_available;
	}
}
