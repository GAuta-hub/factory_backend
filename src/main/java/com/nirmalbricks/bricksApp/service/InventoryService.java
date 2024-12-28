package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;
import com.nirmalbricks.bricksApp.model.Inventory;

public interface InventoryService {

	public Optional< List<Inventory>> getInventoryDetails();
	
	public void addInventory(Inventory inventory);

	public void deleteInventoryDetails(int material_id);

	public void updateInventoryDetails(Inventory inventory);


	
}
