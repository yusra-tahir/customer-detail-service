package com.example.resource;

import com.example.entity.DetailList;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/details/{cId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public DetailList searchDetailByCustomerIdResource(@PathVariable("cId") int customerId) {
        return new DetailList(customerService.searchDetailByCustomerId(customerId));
    }

}
