
package com.emp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *@author Paramasivam Thangavel
 *@created Aug 29, 2025
**/

@Component
public class MyService {
	
	@Value("${app.myservice.message:Default Message!}")
	private String message;
	
	public void print() {
		System.out.println(message);
	}

}

