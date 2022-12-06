package com.vic.service;

import java.util.List;

import com.vic.entity.CustomerShare;

/**
 *
 * @author vic
 * date: 06/12/2022
 * purpose: The DTO INTERFACE (SERVICE LAYER)
 *
 */
public interface CustomerDetailService {

	//create the methods to make a call to the DAO to retrieve data from the database:
	//TO GET CUSTOMER SHARES VIA CUSTOMERID:
	//import 'List' and 'CustomerShare'
	List<CustomerShare> getCustomerShareByCustomerID(int customerId);
}
