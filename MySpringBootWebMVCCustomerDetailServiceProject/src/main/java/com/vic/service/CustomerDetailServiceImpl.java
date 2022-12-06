package com.vic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vic.entity.Customer;
import com.vic.entity.CustomerShare;
import com.vic.entity.Share;
import com.vic.entity.ShareList;

/**
 *
 * @author vic
 * date: 06/12/2022
 * purpose: The SERVICE IMPLEMENTAION  (SERVICE LAYER - implementation)
 *
 */

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService{

	//Instantiate a 'RestTemplate' object:
	//the '@Autowired' annotation is used to tell Spring which candidate it can use:
	//import 'RestTemplate' (which is used to call Rest API), and '@Autowired':
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CustomerShare> getCustomerShareByCustomerID(int customerId) {
		//instantiate a new 'CustomerShare' ArrayList object:
		//import 'List' and 'ArrayList'
		List<CustomerShare> customerShareList = new ArrayList<CustomerShare>();
		
		//instantiate a new 'ShareList' object and use it to call the Share service and store the list in the 'shareList' object:
		//import it
		ShareList shareList = restTemplate.getForObject("http://localhost:8084/shares" + customerId, ShareList.class);
		
		
		//an enhanced 'for' loop to iterate over ShareList to pick every share:
		for(Share share:shareList.getShares()) {
			//from every share, picking customer ID and calling Customer service:
			//instantiate a new 'Customer' object:
			Customer customer = restTemplate.getForObject("http://localhost:8082/customers/" + share.getShareId(), Customer.class);
		
			//instantiate a new 'CustomerShare' object:
			CustomerShare customerShare = new CustomerShare(share.getShareId(), customer.getShareType(), customer.getQuantity(), customer.getCustomerId(), share.getMarketPrice(), share.getShareName());
			
			//add the new 'CustomerShare' object into the 'customerShareList' list:
			customerShareList.add(customerShare);
		}
		return customerShareList;
	}
}