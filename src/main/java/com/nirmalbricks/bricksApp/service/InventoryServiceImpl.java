package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmalbricks.bricksApp.model.Inventory;
import com.nirmalbricks.bricksApp.repo.InventoryRepo;

@Service
public class InventoryServiceImpl implements InventoryService{
	@Autowired
	InventoryRepo inventoryRepo;

	@Override
	public Optional<List<Inventory>> getInventoryDetails() {
		// TODO Auto-generated method stub
		return inventoryRepo.getallInventory();
	}

	@Override
	public void addInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventoryRepo.save(inventory);
	}

	@Override
	public void deleteInventoryDetails(int material_id) {
		// TODO Auto-generated method stub
		inventoryRepo.deleteInventoryDetails(material_id);
	}

	@Override
	public void updateInventoryDetails(Inventory inventory) {
		// TODO Auto-generated method stub
		inventoryRepo.updateinventoryDetails(inventory.getMaterial_quantity_used(),inventory.getMaterial_quantity_available(),inventory.getMaterial_id());	
	
	}
	
	
}
