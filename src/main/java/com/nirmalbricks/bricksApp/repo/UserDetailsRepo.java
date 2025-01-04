package com.nirmalbricks.bricksApp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nirmalbricks.bricksApp.model.UserDetails;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer>{

	@Query(nativeQuery = true,value="select * from userdetails")
	Optional<List<UserDetails>> getallUserDetails();
	
	@Modifying
	@Query(nativeQuery = true,value="delete from userdetails where user_ID=?1")
	void deleteUserDetails(int user_ID);

	
	@Modifying
	@Query(nativeQuery = true,value="update userdetails set password=?1,reentter_password=?2,phone_number=?3 where user_ID=?4")
	void updateUserDetails(String password, String reentter_password, String phone_number, int user_ID);

}
