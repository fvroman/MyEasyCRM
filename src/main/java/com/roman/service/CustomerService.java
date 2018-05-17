package com.roman.service;

import com.roman.jdbc.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

}
