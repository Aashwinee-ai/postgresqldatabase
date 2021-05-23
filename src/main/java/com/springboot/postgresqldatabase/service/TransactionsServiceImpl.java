package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.exception.ResourceNotFoundException;
import com.springboot.postgresqldatabase.model.SystemAdminTransactions;
import com.springboot.postgresqldatabase.model.Transactions;
import com.springboot.postgresqldatabase.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TransactionsServiceImpl implements TransactionsService{
    @Autowired
    private TransactionsRepository transactionsRepository;

    @Override
    public Transactions createTransactions(Transactions transactions) {
        Optional<Transactions> transactionsDb = this.transactionsRepository.findById(transactions.getId());
        if (transactionsDb.isPresent()) {
            Transactions transactionsUpdate = transactionsDb.get();
            transactionsUpdate.setId(transactions.getId());
            transactionsUpdate.setCustomerRegistration(transactions.getCustomerRegistration());
            transactionsUpdate.setAccountOpening(transactions.getAccountOpening());
            transactionsUpdate.setBalanceChecks(transactions.getBalanceChecks());
            transactionsUpdate.setMicroInsurance(transactions.getMicroInsurance());
            transactionsUpdate.setCashIn(transactions.getCashIn());
            transactionsUpdate.setCashOut(transactions.getCashOut());
            transactionsUpdate.setRemittances(transactions.getRemittances());
            transactionsUpdate.setTransfers(transactions.getTransfers());
            transactionsUpdate.setPreApprovedNanoLoans(transactions.getPreApprovedNanoLoans());
            transactionsUpdate.setBillPayments(transactions.getBillPayments());
            transactionsUpdate.setAirTimeTopUp(transactions.getAirTimeTopUp());
            transactionsUpdate.setMiniStatements(transactions.getMiniStatements());
            transactionsRepository.save(transactionsUpdate);
            return transactionsUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + transactions.getId());
        }

    }

    @Override
    public Transactions updateTransactions(Transactions Transactions) {
        return null;
    }

    @Override
    public List<Transactions> getAllTransactions() {
        return this.transactionsRepository.findAll();
    }

    @Override
    public Transactions getTransactionsById(Long id) {
        Optional<Transactions> transactionsDb = this.transactionsRepository.findById(id);
        if(transactionsDb.isPresent()) {
            return transactionsDb.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id :" + id));
        }
    }

    @Override
    public Transactions deleteTransactions(long id) {
        Optional<Transactions> transactionsDb =
                this.transactionsRepository.findById(id);
        if (transactionsDb.isPresent()) {
            return transactionsDb.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id :" + id));
        }

    }
}

