package com.nirmalbricks.bricksApp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.nirmalbricks.bricksApp.model.RawMaterials;

public interface RawMaterialsRepo extends JpaRepository<RawMaterials,Integer>{
	
	@Query(nativeQuery = true,value="select * from rawmaterials")
	Optional<List<RawMaterials>> getallRawMaterials();
	
	@Modifying
	@Query(nativeQuery = true,value="delete from rawmaterials where rawmaterial_id=?1")
	void deleteRawMaterialsDetails(int rawmaterial_id);

	
	@Modifying
	@Query(nativeQuery = true,value="update rawmaterials set quantity=?1,total_amount=?2,phone_number=?3,address=?4 where rawmaterial_id=?5")
	void updaterawMaterialsDetails(int quantity, int total_amount,int phone_number, String address,int rawmaterial_id);
}
