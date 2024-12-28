package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;
import com.nirmalbricks.bricksApp.model.StockAvailable;

public interface StockAvailableService {
	
	public Optional< List<StockAvailable>> getStockAvailableDetails();
	
	public void addStockAvailable(StockAvailable stockAvailable);

	public void deleteStockAvailableDetails(int serial_number);

	public void updateStockAvailableDetails(StockAvailable StockAvailable);
}
