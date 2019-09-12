package com.lambdaschool.ordersproject.repos;

import com.lambdaschool.ordersproject.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent, Long>
{
}
