package cop.cus.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
	
	@Autowired
	private Customer customer;
	
	
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	//setter injection.
	@Autowired
	public void setCustomer(Customer customer) {
		System.out.println("Setter Injection for Customer...");
		
	}
	
	public void runProduct(){
		
		//new Product(customer);
		
		
		
		setCustomer(customer);
		Customer cus = getCustomer();
		cus.setName("Walmart");
		System.out.println("The New Customer Created in setter Method Injection : "+customer);
		
	}
	
	//Constructor injection
//		public Product(Customer customer) {
//			customer.setName("Stop & Shop");
//			System.out.println("The New Customer Created in Constructor Injection : "+customer);
//		}
	public Product(String name, String location) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
	}
	public Product(){
		
	}
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	String id;
	String location;
 
}