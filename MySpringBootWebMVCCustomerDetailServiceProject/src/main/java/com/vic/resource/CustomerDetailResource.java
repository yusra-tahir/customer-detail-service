package com.vic.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vic.entity.CustomerShareList;
import com.vic.service.CustomerDetailService;

/**
 *
 * @author vic
 * date: 06/12/2022
 * purpose: The RESOURCE Class
 *
 */

@RestController
public class CustomerDetailResource {

	//instantiate a 'CustomerDetailService' object:
	//import 'CustomerDetailService' and '@Autowired':
	@Autowired
	private CustomerDetailService customerDetailService;
	
	//GET 
	@GetMapping(path = "/customer/shares/{cId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerShareList getCustomerShareList(@PathVariable("cId") int cId) {
		return new CustomerShareList(customerDetailService.getCustomerShareByCustomerID(cId));
	}
}
