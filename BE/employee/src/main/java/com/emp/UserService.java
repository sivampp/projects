
/**
 *@author Paramasivam Thangavel
**/
package com.emp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("session")
@Component
public class UserService {
	
	public User getUser() {
		
		return new User("raja","raja");
	}

}
