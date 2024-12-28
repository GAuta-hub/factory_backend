package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmalbricks.bricksApp.model.RawMaterials;
import com.nirmalbricks.bricksApp.repo.RawMaterialsRepo;

@Service
public class RawMaterialsServiceImpl implements RawMaterialsService{
	@Autowired
	RawMaterialsRepo rawMaterialsRepo;

	@Override
	public Optional<List<RawMaterials>> getRawMaterialsDetails() {
		// TODO Auto-generated method stub
		return rawMaterialsRepo.getallRawMaterials();
	}

	@Override
	public void addRawMaterials(RawMaterials rawMaterials) {
		// TODO Auto-generated method stub
		rawMaterialsRepo.save(rawMaterials);
	}

	@Override
	public void deleteRawMaterialsDetails(int rawmaterial_id) {
		// TODO Auto-generated method stub
		rawMaterialsRepo.deleteRawMaterialsDetails(rawmaterial_id);
	}

	@Override
	public void updateRawMaterialsDetails(RawMaterials rawMaterials) {
		// TODO Auto-generated method stub
		rawMaterialsRepo.updaterawMaterialsDetails(rawMaterials.getQuantity(),rawMaterials.getTotal_amount(), rawMaterials.getPhone_number(),rawMaterials.getAddress(), rawMaterials.getRawmaterial_id());
	}

}
