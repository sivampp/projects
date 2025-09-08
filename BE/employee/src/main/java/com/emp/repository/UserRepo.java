
package com.emp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emp.User;
import com.emp.model.UserDao;
import com.emp.model.UserResponse;

//import order.model.Order;
//import order.model.OrderResponse;

/**
 *@author Paramasivam Thangavel
 *@created Sep 5, 2025
**/
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value="SELECT ID, NAME, PASSWORD, ROLE FROM CPO_DB.USER WHERE NAME = :name ",
			nativeQuery=true)
	UserDao getUserDetails(@Param("name") String name);
}

