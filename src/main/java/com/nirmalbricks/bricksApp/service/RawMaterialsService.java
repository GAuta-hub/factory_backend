package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import com.nirmalbricks.bricksApp.model.RawMaterials;

public interface RawMaterialsService {
	
	public Optional< List<RawMaterials>> getRawMaterialsDetails();
	
	public void addRawMaterials(RawMaterials rawMaterials);

	public void deleteRawMaterialsDetails(int rawmaterial_id);

	public void updateRawMaterialsDetails(RawMaterials rawMaterials);

}
