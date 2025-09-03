package cop.cus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cop.cus.service.Product;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ComponentScan("cop.cus")
public class CustApplication {

	public static void main(String[] args) {
		ApplicationContext cxt=  SpringApplication.run(CustApplication.class, args);
		Product prd = cxt.getBean(Product.class);
		prd.runProduct();
		
	}

}
