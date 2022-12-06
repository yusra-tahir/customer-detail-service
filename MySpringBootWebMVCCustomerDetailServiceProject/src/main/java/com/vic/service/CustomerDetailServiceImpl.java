package com.vic.service;

import java.util.ArrayList;
import java.util.List;

import com.vic.entity.DetailList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vic.entity.Detail;
import com.vic.entity.CustomerShare;
import com.vic.entity.Share;

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
		DetailList details = restTemplate.getForObject("http://localhost:8084/details/" + customerId, DetailList.class);
		
		
		//an enhanced 'for' loop to iterate over ShareList to pick every share:
		for(Detail detail: details.getDetails()) {
			//from every share, picking customer ID and calling Customer service:
			//instantiate a new 'Customer' object:
			Share share = restTemplate.getForObject("http://localhost:8082/shares/" + detail.getShareId(), Share.class);
		
			//instantiate a new 'CustomerShare' object:
			CustomerShare customerShare = new CustomerShare(detail.getCustomerId(), share.getShareName(), detail.getQuantity(), share.getSharePrice(), (detail.getQuantity() * share.getSharePrice()), detail.getShareType());
			
			//add the new 'CustomerShare' object into the 'customerShareList' list:
			customerShareList.add(customerShare);
		}
		return customerShareList;
	}
}
