package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.exception.ResourceNotFoundException;
import com.springboot.postgresqldatabase.model.AgentNetworkManagement;
import com.springboot.postgresqldatabase.repository.AgentNetworkManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AgentNetworkManagementServiceImpl implements AgentNetworkManagementService {

    @Autowired
    private AgentNetworkManagementRepository agentNetworkManagementRepository;

    @Override
    public AgentNetworkManagement createAgentNetworkManagement(AgentNetworkManagement agentNetworkManagement) {
        return agentNetworkManagementRepository.save(agentNetworkManagement);

    }

    @Override
    public AgentNetworkManagement updateAgentNetworkManagement(AgentNetworkManagement agentNetworkManagement) {
        Optional<AgentNetworkManagement> agentNetworkManagementDb = this.agentNetworkManagementRepository.findById(agentNetworkManagement.getId());
        if (agentNetworkManagementDb.isPresent()) {
            AgentNetworkManagement agentNetworkManagementUpdate = agentNetworkManagementDb.get();
            agentNetworkManagementUpdate.setId(agentNetworkManagement.getId());
            agentNetworkManagementUpdate.setAgentManagerid(agentNetworkManagement.getAgentManagerid());
            agentNetworkManagementUpdate.setSuperAgentid(agentNetworkManagement.getSuperAgentid());
            agentNetworkManagementUpdate.setAgentid(agentNetworkManagement.getAgentid());
            agentNetworkManagementUpdate.setAgentMembersid(agentNetworkManagement.getAgentMembersid());
            agentNetworkManagementRepository.save(agentNetworkManagementUpdate);
            return agentNetworkManagementUpdate;
        } else {
        throw new ResourceNotFoundException("Record not found with id : " + agentNetworkManagement.getId());
    }

  }


    @Override
    public List<AgentNetworkManagement> getAllAgentNetworkManagement() {
        return this.agentNetworkManagementRepository.findAll();
    }

    @Override
    public AgentNetworkManagement getAgentNetworkManagementById(long id) {
        Optional<AgentNetworkManagement> agentNetworkManagement1 = this.agentNetworkManagementRepository.findById(id);
        if (agentNetworkManagement1.isPresent()) {
            return agentNetworkManagement1.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id :" + id));
        }
    }

    @Override
    public void deleteAgentNetworkManagement(long id) {

        Optional<AgentNetworkManagement> agentNetworkManagementDb = this.agentNetworkManagementRepository.findById(id);

        if (agentNetworkManagementDb.isPresent()) {
            this.agentNetworkManagementRepository.delete(agentNetworkManagementDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id :" + id);
        }
      }
    }

