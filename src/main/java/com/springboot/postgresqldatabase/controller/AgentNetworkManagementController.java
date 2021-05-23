package com.springboot.postgresqldatabase.controller;

import com.springboot.postgresqldatabase.model.AgentNetworkManagement;
import com.springboot.postgresqldatabase.service.AgentNetworkManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentNetworkManagementController {

    @Autowired
    private AgentNetworkManagementService agentNetworkManagementService;

    @GetMapping("/agentnetworkmanagement")
    public ResponseEntity<List<AgentNetworkManagement>> getAllAgentNetworkManagement() {

        return ResponseEntity.ok().body(agentNetworkManagementService.getAllAgentNetworkManagement());
    }
    @GetMapping ("/agentnetworkmanagement/{id}")
    public ResponseEntity<AgentNetworkManagement> getAgentNetworkManagementById(@PathVariable long id) {
        return ResponseEntity.ok().body(agentNetworkManagementService.getAgentNetworkManagementById(id));
    }
    @PostMapping("/create/agentnetworkmanagement")
    public ResponseEntity<AgentNetworkManagement> createAgentNetworkManagement(@RequestBody AgentNetworkManagement agentNetworkManagement) {
        return ResponseEntity.ok().body(this.agentNetworkManagementService.createAgentNetworkManagement(agentNetworkManagement));
    }
    @PutMapping("/put/agentnetworkmanagement/{id}")
    public ResponseEntity<AgentNetworkManagement> updateAgentNetworkManagement(@PathVariable long id, @RequestBody AgentNetworkManagement agentNetworkManagement) {
        agentNetworkManagement.setId(id);
        return ResponseEntity.ok().body(this.agentNetworkManagementService.updateAgentNetworkManagement(agentNetworkManagement));
    }
}
