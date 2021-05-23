package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.exception.ResourceNotFoundException;
import com.springboot.postgresqldatabase.model.AgentTransactions;
import com.springboot.postgresqldatabase.model.Transactions;
import com.springboot.postgresqldatabase.repository.AgentTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AgentTransactionsServiceImpl implements AgentTransactionsService{

    @Autowired
    private AgentTransactionsRepository agentTransactionsRepository;

    @Override
    public AgentTransactions createAgentTransactions(AgentTransactions agentTransactions) {
        return agentTransactionsRepository.save(agentTransactions);
    }

    @Override
    public AgentTransactions updateAgentTransactions(AgentTransactions agentTransactions) {
        Optional<AgentTransactions> agenttransactionsDb = agentTransactionsRepository.findById(agentTransactions.getId());
        if (agenttransactionsDb.isPresent()) {
            AgentTransactions agenttransactionsUpdate = agenttransactionsDb.get();
            agenttransactionsUpdate.setId(agentTransactions.getId());
            agenttransactionsUpdate.setAgentManagement(agentTransactions.getAgentManagement());
            agenttransactionsUpdate.setSubAgentAccounts(agentTransactions.getSubAgentAccounts());
            agenttransactionsUpdate.setMakingDeposits(agentTransactions.getMakingDeposits());
            agenttransactionsUpdate.setAirTimeTopUp(agentTransactions.getAirTimeTopUp());
            agenttransactionsUpdate.setBillPayments(agentTransactions.getBillPayments());
            agenttransactionsUpdate.setLoanApplications(agentTransactions.getLoanApplications());
            agenttransactionsUpdate.setRemoteAccountOpening(agentTransactions.getRemoteAccountOpening());
            agenttransactionsUpdate.setAgentAccoountsManagement(agentTransactions.getAgentAccoountsManagement());
            agenttransactionsUpdate.setAgentFloatManagement(agentTransactions.getAgentFloatManagement());
            agenttransactionsUpdate.setCommissionManagement(agentTransactions.getCommissionManagement());
            agenttransactionsUpdate.setStructuredReporting(agentTransactions.getStructuredReporting());
            agentTransactionsRepository.save(agenttransactionsUpdate);
            return agenttransactionsUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + agentTransactions.getId());
        }

        }

    @Override
    public List<AgentTransactions> getAllAgentTransactions() {
        return agentTransactionsRepository.findAll();
    }

    @Override
    public AgentTransactions getAgentTransactionsById(long id) {
        Optional<AgentTransactions> agentTransactionsDb = this.agentTransactionsRepository.findById(id);
        if(agentTransactionsDb.isPresent()) {
            return agentTransactionsDb.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id :" + id));
        }
    }


    @Override
    public AgentTransactions deleteAgentTransactions(long id) {
        Optional<AgentTransactions> agentTransactionsDb =
                this.agentTransactionsRepository.findById(id);
        if (agentTransactionsDb.isPresent()) {
            return agentTransactionsDb.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id :" + id));
        }
    }
}
