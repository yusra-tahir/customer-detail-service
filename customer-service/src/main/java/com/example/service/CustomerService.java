package com.example.service;

import com.example.entity.Detail;

import java.util.List;

public interface CustomerService {

    List<Detail> searchDetailByCustomerId(int customerId);
}
