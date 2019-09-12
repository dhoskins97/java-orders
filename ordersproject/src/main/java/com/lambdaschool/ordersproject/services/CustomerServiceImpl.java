package com.lambdaschool.ordersproject.services;

import com.lambdaschool.ordersproject.models.Customer;
import com.lambdaschool.ordersproject.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository custrepo;

    @Override
    public List<Customer> findAll() {
        List<Customer> list = new ArrayList<>();
        custrepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer findCustomerByName(String custname) {
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Customer customer, long id) {
        return null;
    }
}
