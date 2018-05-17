package com.roman.jdbc.dao;

import com.roman.jdbc.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);
}
