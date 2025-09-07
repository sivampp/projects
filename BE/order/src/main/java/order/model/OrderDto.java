
package order.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *@author Paramasivam Thangavel
 *@created Sep 6, 2025
**/

@Data
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDto {
	
	@JsonProperty("Id")
	private Integer id;
	@JsonProperty("Item")
	private String item;
	@JsonProperty("Item_desc")
	private String item_desc;
	@JsonProperty("Price")
	private String price;

}

