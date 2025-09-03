package cop.cus.controller;
 
 
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cop.cus.service.Product;
 
import cop.cus.service.ProductService;
 
@CrossOrigin("*")
@RestController
@RequestMapping("/cop")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	//http://localhost:8001/cop/product
	@GetMapping(value="/product", produces={MediaType.APPLICATION_JSON_VALUE})
	List<Product> getProduct() {
		return service.getProduct();
		
		
	}
	
 
}