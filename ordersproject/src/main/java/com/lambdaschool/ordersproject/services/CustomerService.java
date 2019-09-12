package com.lambdaschool.ordersproject.services;

import com.lambdaschool.ordersproject.models.Customer;

import java.util.List;

public interface CustomerService
{
List<Customer> findAll();

Customer findCustomerByName(String custname);

Customer save(Customer customer);

Customer update(Customer customer, long id);
}
