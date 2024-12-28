package com.nirmalbricks.bricksApp.service;

import java.util.List;
import java.util.Optional;

import com.nirmalbricks.bricksApp.model.UserDetails;

public interface UserDetailsService {
	
public Optional< List<UserDetails>> getUserDetails();
	
	public void addUser(UserDetails userDetails);

	public void deleteUserDetails(int user_ID);

	public void updateUserDetails(UserDetails userDetails);


}
