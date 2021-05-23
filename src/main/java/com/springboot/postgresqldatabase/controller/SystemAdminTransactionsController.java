package com.springboot.postgresqldatabase.controller;

import com.springboot.postgresqldatabase.model.AgentNetworkManagement;
import com.springboot.postgresqldatabase.model.SystemAdminTransactions;
import com.springboot.postgresqldatabase.service.AgentNetworkManagementService;
import com.springboot.postgresqldatabase.service.SystemAdminTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class SystemAdminTransactionsController {

    @Autowired
    private SystemAdminTransactionsService systemAdminTransactionsService;

    @GetMapping("/admintransactions")
    public ResponseEntity<List<SystemAdminTransactions>> getAllSystemAdminTransactions() {

        return ResponseEntity.ok().body(systemAdminTransactionsService.getAllSystemAdminTransactions());
    }
    @GetMapping ("/admintransactions/{id}")
    public ResponseEntity<SystemAdminTransactions> getSystemAdminTransactionsById(@PathVariable long id) {
        return ResponseEntity.ok().body(systemAdminTransactionsService.getSystemAdminTransactionsById(id));
    }
    @PostMapping("/create/admintransactions")
    public ResponseEntity<SystemAdminTransactions> createSystemAdminTransactions(@RequestBody SystemAdminTransactions systemAdminTransactions) {
        return ResponseEntity.ok().body(this.systemAdminTransactionsService.createSystemAdminTransactions(systemAdminTransactions));
    }
    @PutMapping("/put/admintransactions/{id}")
    public ResponseEntity<SystemAdminTransactions> updateSystemAdminTransactions(@PathVariable long id, @RequestBody SystemAdminTransactions systemAdminTransactions) {
        systemAdminTransactions.setId(id);
        return ResponseEntity.ok().body(this.systemAdminTransactionsService.updateSystemAdminTransactions(systemAdminTransactions));
    }
}
