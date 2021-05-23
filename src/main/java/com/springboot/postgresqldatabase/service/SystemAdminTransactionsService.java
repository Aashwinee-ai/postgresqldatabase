package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.model.SystemAdminTransactions;

import java.util.List;

public interface SystemAdminTransactionsService {

    SystemAdminTransactions createSystemAdminTransactions(SystemAdminTransactions systemAdminTransactions);
    SystemAdminTransactions updateSystemAdminTransactions(SystemAdminTransactions systemAdminTransactions);
    List<SystemAdminTransactions> getAllSystemAdminTransactions();
    SystemAdminTransactions getSystemAdminTransactionsById(Long SystemAdminTransactions);
    SystemAdminTransactions deleteSystemAdminTransactions(long id);
}
