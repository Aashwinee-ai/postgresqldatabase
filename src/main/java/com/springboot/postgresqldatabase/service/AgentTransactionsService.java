package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.model.AgentTransactions;

import java.util.List;

public interface AgentTransactionsService {
    AgentTransactions createAgentTransactions(AgentTransactions agentTransactions);

    AgentTransactions updateAgentTransactions(AgentTransactions agentTransactions);

    List< AgentTransactions > getAllAgentTransactions();

    AgentTransactions getAgentTransactionsById(long agentTransactions);

    AgentTransactions deleteAgentTransactions(long id);
}
