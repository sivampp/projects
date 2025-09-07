
package order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import order.model.Order;
import order.model.OrderResponse;

/**
 *@author Paramasivam Thangavel
 *@created Sep 5, 2025
**/
@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

	@Query(value="SELECT ID, ITEM, ITEM_DESC, PRICE FROM CPO_DB.ORDERS WHERE ID = :id ",
			nativeQuery=true)
	List<OrderResponse> getOrder(@Param("id") String id);
}

