package com.nirmalbricks.bricksApp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nirmalbricks.bricksApp.model.StockAvailable;
@Repository
public interface StockAvailableRepo extends JpaRepository<StockAvailable, Integer> {
	
	@Query(nativeQuery = true,value="select * from stockavailable")
	Optional<List<StockAvailable>> getallStockAvailable();
	
	@Modifying
	@Query(nativeQuery = true,value="delete from stockavailable where serial_number=?1")
	void deleteStockAvailableDetails(int serial_number);

	
	@Modifying
	@Query(nativeQuery = true,value="update stockavailable set incoming=?1,outgoing=?2,balance=?3 where serial_number=?4")
	void updatestockAvailableDetails(int incoming, int outgoing, int balance, int serial_number);
}
