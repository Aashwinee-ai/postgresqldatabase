package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.model.SystemAdminTransactions;
import com.springboot.postgresqldatabase.model.Transactions;

import java.util.List;

public interface TransactionsService {

    Transactions createTransactions(Transactions Transactions);
    Transactions updateTransactions(Transactions Transactions);
    List<Transactions> getAllTransactions();
    Transactions getTransactionsById(Long Transactions);
    Transactions deleteTransactions(long id);
}
