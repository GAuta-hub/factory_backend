package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmalbricks.bricksApp.model.StockAvailable;
import com.nirmalbricks.bricksApp.repo.StockAvailableRepo;

@Service
public class StockAvailableServiceImpl implements StockAvailableService{
	
	@Autowired
	StockAvailableRepo stockAvailableRepo;
	@Override
	public Optional<List<StockAvailable>> getStockAvailableDetails() {
		// TODO Auto-generated method stub
		return stockAvailableRepo.getallStockAvailable();
	}

	@Override
	public void addStockAvailable(StockAvailable stockAvailable) {
		// TODO Auto-generated method stub
		stockAvailableRepo.save(stockAvailable);
	}

	@Override
	public void deleteStockAvailableDetails(int serial_number) {
		// TODO Auto-generated method stub
		stockAvailableRepo.deleteStockAvailableDetails(serial_number);
	}

	@Override
	public void updateStockAvailableDetails(StockAvailable stockAvailable) {
		// TODO Auto-generated method stub
		stockAvailableRepo.updatestockAvailableDetails(stockAvailable.getIncoming(), stockAvailable.outgoing, stockAvailable.balance, stockAvailable.serial_number);
	}

	
}
