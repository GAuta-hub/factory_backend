package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmalbricks.bricksApp.model.UserDetails;
import com.nirmalbricks.bricksApp.repo.UserDetailsRepo;
@Service

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UserDetailsRepo userDetailsRepo;
	
	@Override
	public Optional<List<UserDetails>> getUserDetails() {
		// TODO Auto-generated method stub
		return userDetailsRepo.getallUserDetails();
	}

	@Override
	public void addUser(UserDetails userDetails) {
		// TODO Auto-generated method stub
		userDetailsRepo.save(userDetails);
	}


	@Override
	public void deleteUserDetails(int user_ID) {
		// TODO Auto-generated method stub
		userDetailsRepo.deleteUserDetails(user_ID);
	}

	@Override
	public void updateUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		userDetailsRepo.updateUserDetails(userDetails.getPassword(), userDetails.getReentter_Password(), userDetails.getPhone_Number(),userDetails.user_ID );
	}








}
