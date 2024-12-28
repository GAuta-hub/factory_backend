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

import com.nirmalbricks.bricksApp.model.RawMaterials;
import com.nirmalbricks.bricksApp.service.RawMaterialsService;

@CrossOrigin(origins = "*")
@RestController
public class RawMaterialsController {
	
	@Autowired
	RawMaterialsService rawMaterialService;
	
	@GetMapping("/getrawmaterialsdetails")
	public Optional<List<RawMaterials>> getRawMaterialsDetails(){
	return rawMaterialService.getRawMaterialsDetails();	
	}
	
	@PostMapping("/addrawmaterialsdetails")
	public void addRawMaterials (@RequestBody RawMaterials rawMaterials) {
		rawMaterialService.addRawMaterials(rawMaterials);	
	}

    @DeleteMapping("/deleterawmaterials")
    public void deleteRawMaterials  (@RequestParam(name="rawMaterials") int rawMaterials) {
    	rawMaterialService.deleteRawMaterialsDetails(rawMaterials);
    }
    
    @PutMapping("/updaterawmaterials")
    public void updateRawMaterials (@RequestBody RawMaterials rawMaterials) {
    	rawMaterialService.updateRawMaterialsDetails(rawMaterials);
    }


}

