package com.emp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.emp.User;
import com.emp.service.LoginService;
import com.emp.util.JwtUtil;


@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class AuthController {

	
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private  JwtUtil jwtUtil;
    
    @Autowired
    private LoginService loginService;

	
	
	@PostMapping("/login")
	public ResponseEntity< ?> loginUser(@RequestBody Map<String, String> body) {
		
		String username = body.get("username");
		String password = body.get("password");
		System.out.println("User Name is : "+username);
		System.out.println("password is : "+password);
		String token = jwtUtil.generateToken(username);
		System.out.println(token);
		return ResponseEntity.ok(Map.of("token",token));
	}
	
	@PostMapping("/login/v1")
	public ResponseEntity< ?> validateUser(@RequestBody Map<String, String> body) {
		
		String tokenFromService = loginService.validateUser(body);
		
		String username = body.get("username");
		String password = body.get("password");
		System.out.println("User Name is : "+username);
		System.out.println("password is : "+password);
		//String token = jwtUtil.generateToken(username);
		System.out.println(tokenFromService);
		return ResponseEntity.ok(Map.of("token",tokenFromService));
	}
	
	
	
	
	@GetMapping("/emp/{id}")
	public String getEmployee() {
		
		return "Krishna";
		
	}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	private AuthenticationManager authManager;
	
//	@Autowired
//	JwtUtil jwtUtil;
	
//	@PostMapping("/login")
//	public ResponseEntity<Map<String, String>> login(@RequestBody User user) {
//		try {
//		Authentication authentication = authManager
//				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
//		UserDetails userDetails = (UserDetails)authentication.getPrincipal();
//		String token = jwtUtil.generateToken(userDetails);
//		return ResponseEntity.ok(Map.of("token",token));
//		}catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", "invalid"));
//		}

	








