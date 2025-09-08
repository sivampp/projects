
package com.emp.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.UserDao;
import com.emp.repository.UserRepo;
import com.emp.util.JwtUtil;

/**
 *@author Paramasivam Thangavel
 *@created Sep 7, 2025
**/
@Service
public class LoginService {
	
	@Autowired
	private UserRepo userRepo;
	
	 @Autowired
	 private  JwtUtil jwtUtil;
	
	
	
	private UserDao getUserdetails(String name) {
		
		UserDao user = userRepo.getUserDetails(name);
		
		System.out.println(user);
		
		return user;
	}
	
	public String validateUser(Map<String, String> req) {
		System.out.println(req.get("username") + "from LoginService.validateUser()");
		
		UserDao userFromDB = getUserdetails(req.get("username"));
		
		System.out.println("userFromDB "+userFromDB);
		
		String token = jwtUtil.generateToken(req.get("username"));
		return token;
		
		
	}

}

