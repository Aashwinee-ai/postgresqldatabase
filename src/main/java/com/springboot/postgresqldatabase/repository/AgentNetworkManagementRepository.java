package com.springboot.postgresqldatabase.repository;

import com.springboot.postgresqldatabase.model.Agent;
import com.springboot.postgresqldatabase.model.AgentNetworkManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentNetworkManagementRepository extends JpaRepository<AgentNetworkManagement,Long> {

}
