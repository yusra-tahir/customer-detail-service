package com.vic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vic
 * date: 06/12/2022
 * purpose: The CUSTOMER SHARE ENTITY Class
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerShare {

	//declare the variables:
	private int customerId;
	private String shareName;
	private int quantity;
	private double unitPrice;
	private double totalValuation;
	private String shareType;
}
