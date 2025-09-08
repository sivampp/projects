
package order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import jakarta.websocket.server.PathParam;
import order.model.Order;
import order.model.OrderDto;
import order.model.OrderResponse;
import order.repository.OrderRepo;
import order.service.OrderService;

/**
 *@author Paramasivam Thangavel
 *@created Sep 5, 2025
**/

@RestController
@RequestMapping("/ord")
public class OrderController {
	
	@Autowired
	private OrderRepo  orderRepo;
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/add")
	public void addOrder(@RequestBody Order order) {
		System.out.println(order);
		
		//service.addOrder(order);
		
		orderRepo.save(order);
		
		
	}
	
	@GetMapping("/orders")
	
	public Iterable<Order> getOrders(){
		return orderRepo.findAll();
	}
	
	//@Cacheable(key="#id", value="Order")
	@GetMapping(value="/order/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<OrderResponse> getOrder(
			@PathVariable("id") String id
			){
		System.out.println("The Order is from request is "+id);
				List<OrderResponse> res = service.getOrder(id);
				return res;
			}

}

