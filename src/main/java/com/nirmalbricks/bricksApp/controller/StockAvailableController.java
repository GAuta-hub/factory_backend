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

import com.nirmalbricks.bricksApp.model.StockAvailable;
import com.nirmalbricks.bricksApp.service.StockAvailableService;

@RestController
@CrossOrigin(origins ="*")
public class StockAvailableController {
	
	@Autowired
	StockAvailableService stockAvailableService;
	
	@GetMapping("/getstockavailabledetails")
	public Optional<List<StockAvailable>> getStackAvailableDetails(){
		return stockAvailableService.getStockAvailableDetails();
	}
	
	@PostMapping("/addstockavailabledetils")
	public void addStockAvailable(@RequestBody StockAvailable stockAvailable) {
		stockAvailableService.addStockAvailable(stockAvailable);
	}
	
	@DeleteMapping("/deletestockavailabledetails")
	public void deleteStockAvailableDetails(@RequestParam(name="stockAvailable") int stockAvailable) {
		stockAvailableService.deleteStockAvailableDetails(stockAvailable);
	}
	
	@PutMapping("/updatestockavailabledetails")
	public void updateStockAvailableDetails(@RequestBody StockAvailable stockAvailable) {
		stockAvailableService.updateStockAvailableDetails(stockAvailable);
	}
}
