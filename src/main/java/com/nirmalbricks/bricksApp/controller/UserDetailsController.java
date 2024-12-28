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

import com.nirmalbricks.bricksApp.model.UserDetails;
import com.nirmalbricks.bricksApp.service.UserDetailsService;

@RestController
@CrossOrigin(origins = "*")
public class UserDetailsController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@GetMapping("/getuserdetails")
	public Optional<List<UserDetails>> getUserDetails(){
		return userDetailsService.getUserDetails();
	}
	
	@PostMapping("/adduserdetails")
	public void addUser(@RequestBody UserDetails userDetails) {
		userDetailsService.addUser(userDetails);	
	}
	
	@DeleteMapping("/deleteuserdetails")
	public void deleteUserDetails(@RequestParam (name="userDetails" ) int userDetails) {
		userDetailsService.deleteUserDetails(userDetails);
	}
	
	@PutMapping("/updateuserdetails")
	public void updateUserDetails(@RequestBody UserDetails userDetails) {
		userDetailsService.updateUserDetails(userDetails);
	}
}
