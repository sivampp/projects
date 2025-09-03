package cop.cus.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	public String getCustomer() {
		return "{name:Krish, custID:7273168}";
	}
}
