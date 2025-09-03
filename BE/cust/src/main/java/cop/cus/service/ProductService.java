package cop.cus.service;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Component;
@Component
public class ProductService {
	public List<Product> getProduct(){
	List<Product> prodList = new ArrayList();
//	prodList.add(new Product( "Balaji", "Bridgwater"));
//	prodList.add(new Product( "Ranganathar", "Mhawha"));
//	prodList.add(new Product( "Saibaba", "NC"));
//	prodList.add(new Product("Nallapulliammam", "Thiruchengodu"));
	prodList.add(new Product( "Apple", "New York"));
	prodList.add(new Product( "AT T", "Atlanta"));
	prodList.add(new Product( "Tracfone", "Maimi"));
	prodList.add(new Product("Totalwireless", "Florida"));
		return prodList;
	}
 
}