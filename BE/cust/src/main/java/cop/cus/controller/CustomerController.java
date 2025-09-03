package cop.cus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cop.cus.service.CustomerService;
import cop.cus.service.CustomerServiceImpl;

@RestController
@RequestMapping(path="/cop")
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	//http://localhost:8083/cop/login
	@PostMapping(value="/customer", 
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	ResponseEntity<String> getCustomer(){
		
		return new ResponseEntity("Krishna", HttpStatus.OK); 
		
	}
	
	@GetMapping(value="/custname", produces= {MediaType.APPLICATION_JSON_VALUE})
	ResponseEntity<String> getCustomerName(){
		return new ResponseEntity(customerServiceImpl.getCustomer(), HttpStatus.OK);
		//return customerService.getCustomer();
		//return new ResponseEntity("Krishna", HttpStatus.OK); 
		
	}

	
}
