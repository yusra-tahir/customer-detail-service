package com.example.service;

import com.example.entity.Detail;
import com.example.persistence.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;


    @Override
    public List<Detail> searchDetailByCustomerId(int customerId) {
        return customerDao.searchDetailByCustomerId(customerId);
    }
}
