package com.nirmalbricks.bricksApp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nirmalbricks.bricksApp.model.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

	@Query(nativeQuery = true,value="select * from inventory")
	Optional<List<Inventory>> getallInventory();
	
	@Modifying
	@Query(nativeQuery = true,value="delete from inventory where material_id=?1")
	void deleteInventoryDetails(int material_id);

	
	@Modifying
	@Query(nativeQuery = true,value="update inventory set Material_quantity_used=?1,Material_quantity_available=?2 where material_id=?3")
	void updateinventoryDetails(int Material_quantity_used, int Material_quantity_available,int material_id);
}
