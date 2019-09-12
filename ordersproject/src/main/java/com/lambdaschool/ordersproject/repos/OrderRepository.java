package com.lambdaschool.ordersproject.repos;

import com.lambdaschool.ordersproject.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{
}
