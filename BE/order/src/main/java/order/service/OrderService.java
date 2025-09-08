
package order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import order.model.Order;
import order.model.OrderDto;
import order.model.OrderList;
import order.model.OrderResponse;
import order.repository.OrderRepo;

/**
 *@author Paramasivam Thangavel
 *@created Sep 6, 2025
**/

@Component
public class OrderService {
	
	@Autowired
	OrderRepo orderRepo;
//	@Autowired
//	Order order;
	//@Autowired OrderList orderList;
	public List<OrderResponse> getOrder(String id){
		System.out.println("OrderService.getOrder()");
		OrderList orderList = new OrderList();
		List<OrderResponse>  res = orderRepo.getOrder(id);
		return res;
	}
	
	public String addOrder(OrderDto req) {
		
		
		
		return "";
		
	}

}

