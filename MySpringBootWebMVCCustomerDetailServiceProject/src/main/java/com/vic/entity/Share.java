package com.vic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vic
 * date: 06/12/2022
 * purpose: The SHARE ENTITY Class
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Share {

	//declare the variables:
	private int shareId;
	private String shareName;
	private double sharePrice;
}
