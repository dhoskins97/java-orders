package com.lambdaschool.ordersproject.repos;

import com.lambdaschool.ordersproject.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}
