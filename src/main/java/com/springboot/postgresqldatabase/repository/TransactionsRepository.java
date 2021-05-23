package com.springboot.postgresqldatabase.repository;

import com.springboot.postgresqldatabase.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
}
