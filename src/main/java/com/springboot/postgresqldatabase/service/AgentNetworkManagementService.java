package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.model.AgentNetworkManagement;


import java.util.List;

public interface AgentNetworkManagementService {

    AgentNetworkManagement createAgentNetworkManagement(AgentNetworkManagement agentNetworkManagement);

    AgentNetworkManagement updateAgentNetworkManagement(AgentNetworkManagement agentNetworkManagement);

    List< AgentNetworkManagement > getAllAgentNetworkManagement();

    AgentNetworkManagement getAgentNetworkManagementById(long agentNetworkManagement);

    void deleteAgentNetworkManagement(long id);
}
