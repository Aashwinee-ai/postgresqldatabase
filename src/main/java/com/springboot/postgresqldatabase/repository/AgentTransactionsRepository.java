package com.springboot.postgresqldatabase.repository;

import com.springboot.postgresqldatabase.model.AgentTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentTransactionsRepository extends JpaRepository<AgentTransactions, Long> {
}
