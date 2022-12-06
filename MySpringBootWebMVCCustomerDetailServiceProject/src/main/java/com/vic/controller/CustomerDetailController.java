package com.vic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vic.entity.CustomerShare;
import com.vic.service.CustomerDetailService;

/**
 *
 * @author vic
 * date: 06/12/2022
 * purpose: The CONTROLLER CLASS
 *
 */

@Controller
public class CustomerDetailController {

	//declare and instantiate a 'CustomerDetailService' object:
	@Autowired
	private CustomerDetailService customerDetailService;
	
	
	//=========================== CHECK CUSTOMER SHARES BY ID ===========================
	
	//THE PAGE:
	//Mapping Handler - name it differently to it's method name
	@RequestMapping("/")
	public ModelAndView getUserInputPage() {
		//instantiate a 'ModelAndView' object and return it with the HTML file:
		return new ModelAndView("inputUserID");
	}
	
	//THE METHOD:
	//Mapping Handler - name it differently to it's page name
	@RequestMapping("/checkShares")
	public ModelAndView checkSharesController(@RequestParam("checkShares") int customerId) {
		//instantiate a 'ModelAndView' object:
		ModelAndView mav = new ModelAndView();
		
		//instantiate a 'CustomerShare' list object:
		List<CustomerShare> customerShares = customerDetailService.getCustomerShareByCustomerID(customerId);
		
		//setting data for viewing on view:
		mav.addObject("customerShares", customerShares);
		
		//setting data for viewing on view:
		mav.addObject("customerId", customerId);
		
		//retrieving the data for viewing on view:
		mav.setViewName("showShares");
		
		//return the instantiated 'ModelAndView' object - 'mav'
		return mav;
	}
}
