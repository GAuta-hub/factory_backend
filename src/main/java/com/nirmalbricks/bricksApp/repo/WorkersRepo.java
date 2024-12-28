package com.nirmalbricks.bricksApp.repo;

//import java.util.Queue;

//import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.nirmalbricks.bricksApp.model.Workers;

@Repository
public interface WorkersRepo extends JpaRepository<Workers, Integer>{

//	@Modifying
//	Queue<NativeQuery=true, value="DELETE FROM workers WHERE ">
}
