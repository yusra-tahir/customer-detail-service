package com.vic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vic
 * date: 06/12/2022
 * purpose: The CUSTOMER ENTITY Class
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	//declare the variables:
	private int detailId;
	private int customerId;
	private int shareId;
	private String shareType;
	private int quantity;
}
