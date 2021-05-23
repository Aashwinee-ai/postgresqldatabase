package com.springboot.postgresqldatabase.controller;

import com.springboot.postgresqldatabase.model.AgentTransactions;
import com.springboot.postgresqldatabase.model.Transactions;
import com.springboot.postgresqldatabase.service.AgentTransactionsService;
import com.springboot.postgresqldatabase.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentTransactionController {

    @Autowired
    private AgentTransactionsService agentTransactionsService;

    @GetMapping("/agenttransactions")

    public ResponseEntity<List<AgentTransactions>> getAllAgentTransactions() {
        return ResponseEntity.ok().body(agentTransactionsService.getAllAgentTransactions());
    }
    @GetMapping("/agenttransactions/{id}")
    public ResponseEntity<AgentTransactions> getAgentTransactionsById(@PathVariable long id) {
        return ResponseEntity.ok().body(agentTransactionsService.getAgentTransactionsById(id));
    }
    @PostMapping("/create/agenttransactions")
    public ResponseEntity<AgentTransactions> createAgentTransactions(@RequestBody AgentTransactions agentTransactions) {
        return ResponseEntity.ok().body(this.agentTransactionsService.createAgentTransactions(agentTransactions));
    }
    @PutMapping("/put/agenttransactions/{id}")
    public ResponseEntity<AgentTransactions> updateAgentTransactions(@PathVariable long id, @RequestBody AgentTransactions agentTransactions) {
        agentTransactions.setId(id);
        return ResponseEntity.ok().body(this.agentTransactionsService.updateAgentTransactions(agentTransactions));
    }
}

