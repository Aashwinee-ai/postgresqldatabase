package com.springboot.postgresqldatabase.repository;

import com.springboot.postgresqldatabase.model.SystemAdminTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemAdminTransactionsRepository extends JpaRepository<SystemAdminTransactions, Long> {
}
