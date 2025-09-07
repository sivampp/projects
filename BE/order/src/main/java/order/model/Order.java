
package order.model;


import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *@author Paramasivam Thangavel
 *@created Sep 5, 2025
**/


@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="ORDERS", schema="CPO_DB")
public class Order {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="ITEM")
	private String item;
	
	@Column(name="ITEM_DESC")
	private String item_desc;
	
	@Column(name="PRICE")
	private Double price;
	
	@Override
	public String toString() {
		return this.id+" : "+ this.item+" : "+this.item_desc +" : "+ this.price;
	}

}

