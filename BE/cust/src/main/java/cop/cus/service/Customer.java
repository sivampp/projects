package cop.cus.service;

import java.beans.JavaBean;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	
	
	
	@Override
	public java.lang.String toString() {
		
		return name;
	}
	
	
	String name;

	public Customer() {
		System.out.println("Customer() constructor is running...");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
