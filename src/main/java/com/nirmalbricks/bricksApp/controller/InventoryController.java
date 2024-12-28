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

import com.nirmalbricks.bricksApp.model.Inventory;
import com.nirmalbricks.bricksApp.service.InventoryService;

@CrossOrigin(origins = "*")
@RestController
public class InventoryController {
	@Autowired
	InventoryService inventoryService;
	
	@GetMapping("/getinventorydetails")
	public Optional<List<Inventory>> getInventorysDetails(){
		return inventoryService.getInventoryDetails();
	}

 @PostMapping("/addinventorydetails")
  public void addInventory(@RequestBody Inventory inventory) { 
	  
	   inventoryService.addInventory(inventory);
  
  }
  
  @DeleteMapping("/deleteinventorydetails") 
  public void deleteInventoryDetails(@RequestParam(name="inventory") int inventory) { 
	  inventoryService.deleteInventoryDetails(inventory);
	   }

  
  @PutMapping("/updateinventorydetails") 
  public void updateInventoryDetails(@RequestBody Inventory inventory) { 
	  inventoryService.updateInventoryDetails(inventory);
	   }
}
