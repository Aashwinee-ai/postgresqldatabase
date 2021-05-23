package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.exception.ResourceNotFoundException;
import com.springboot.postgresqldatabase.model.RequestData;
import com.springboot.postgresqldatabase.model.SystemAdminTransactions;
import com.springboot.postgresqldatabase.repository.SystemAdminTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SystemAdminTransactionsServiceImpl implements SystemAdminTransactionsService {

    @Autowired
    private SystemAdminTransactionsRepository systemAdminTransactionsRepository;

    @Override
    public SystemAdminTransactions createSystemAdminTransactions(SystemAdminTransactions systemAdminTransactions) {
        return systemAdminTransactionsRepository.save(systemAdminTransactions);
    }

    @Override
    public SystemAdminTransactions updateSystemAdminTransactions(SystemAdminTransactions systemAdminTransactions) {
        Optional<SystemAdminTransactions> systemAdminTransactionsDb = this.systemAdminTransactionsRepository.findById(systemAdminTransactions.getId());
        if (systemAdminTransactionsDb.isPresent()) {
            SystemAdminTransactions systemAdminTransactionsUpdate = systemAdminTransactionsDb.get();
            systemAdminTransactionsUpdate.setId(systemAdminTransactions.getId());
            systemAdminTransactionsUpdate.setAgentmanagement(systemAdminTransactions.getAgentmanagement());
            systemAdminTransactionsUpdate.setAccountmanagement(systemAdminTransactions.getAccountmanagement());
            systemAdminTransactionsUpdate.setTransactionmanagement(systemAdminTransactions.getTransactionmanagement());
            systemAdminTransactionsUpdate.setLiquiditymanagement(systemAdminTransactions.getLiquiditymanagement());
            systemAdminTransactionsUpdate.setTransactionlimitmanagement(systemAdminTransactions.getTransactionlimitmanagement());
            systemAdminTransactionsUpdate.setTransactionchargers(systemAdminTransactions.getTransactionchargers());
            systemAdminTransactionsUpdate.setCommissionmanagement(systemAdminTransactions.getCommissionmanagement());
            systemAdminTransactionsUpdate.setTransactionreconcilliationmodule(systemAdminTransactions.getTransactionreconcilliationmodule());
            systemAdminTransactionsUpdate.setPostingtransaction(systemAdminTransactions.getPostingtransaction());
            systemAdminTransactionsUpdate.setClienttransactionlimit(systemAdminTransactions.getClienttransactionlimit());
            systemAdminTransactionsUpdate.setDailylimitmanagement(systemAdminTransactions.getDailylimitmanagement());
            systemAdminTransactionsRepository.save(systemAdminTransactionsUpdate);
            return systemAdminTransactionsUpdate;

        } else {
            throw new ResourceNotFoundException("Record not found with id : " + systemAdminTransactions.getId());
        }

    }

    @Override
    public List<SystemAdminTransactions> getAllSystemAdminTransactions() {
        return this.systemAdminTransactionsRepository.findAll();
    }

    @Override
    public SystemAdminTransactions getSystemAdminTransactionsById(Long id) {
        Optional<SystemAdminTransactions> systemAdminTransactionsDb = this.systemAdminTransactionsRepository.findById(id);
        if(systemAdminTransactionsDb.isPresent()) {
            return systemAdminTransactionsDb.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id :" + id));
        }
    }


    @Override
    public SystemAdminTransactions deleteSystemAdminTransactions(long id) {
        Optional<SystemAdminTransactions> systemAdminTransactionsDb =
                this.systemAdminTransactionsRepository.findById(id);
        if (systemAdminTransactionsDb.isPresent()) {
            return systemAdminTransactionsDb.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id :" + id));
        }

    }
}
