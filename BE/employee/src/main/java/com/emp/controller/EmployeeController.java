package com.emp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.Employee;

import jakarta.servlet.http.HttpServletRequest;

@RestController
//@CrossOrigin("*")
@CrossOrigin(origins="*")
@RequestMapping("/emp")
public class EmployeeController {
	
	
	private List<Employee> emps = new ArrayList<>(List.of(
			new Employee(102l, "Raja","Thangavel", "10-06-1978",  198000),
			new Employee(102l, "Monisha","Paramasivam", "02-06-1992",  16000),
			new Employee(102l, "Nihasri","Krisna", "10-11-2010",  15000),
			new Employee(102l, "Pranesh","Siva", "15-03-2012",  17000)
			));
	
	//http://localhost:8082/emp/employees
	@GetMapping(value="/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployee(HttpServletRequest request) {
		System.out.println("The user session id is "+request.getSession().getId());
		return emps;
		//return "Employee details 102, Raja  ,  Thangavel, 10-06-1978, 168000";
	}
	
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest req) {
		return (CsrfToken)req.getAttribute("_csrf");
	}
	
	
	@PostMapping(value="employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(HttpServletRequest request) {
		System.out.println("The user session id is "+request.getSession().getId());
		return new Employee(102l, "Pranesh","Siva", "15-03-2012",  17000);
	}
	
	

}
