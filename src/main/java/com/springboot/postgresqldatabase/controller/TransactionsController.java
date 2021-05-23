package com.springboot.postgresqldatabase.controller;

import com.springboot.postgresqldatabase.model.SystemAdminTransactions;
import com.springboot.postgresqldatabase.model.Transactions;
import com.springboot.postgresqldatabase.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.List;

@RestController
@RequestMapping("/agent")
public class TransactionsController {
    @Autowired
    private TransactionsService transactionsService;

    @GetMapping("/transactions")

    public ResponseEntity<List<Transactions>> getAllTransactions() {
        return ResponseEntity.ok().body(transactionsService.getAllTransactions());
    }
        @GetMapping("/transactions/{id}")
                public ResponseEntity<Transactions> getTransactionsById(@PathVariable long id) {
            return ResponseEntity.ok().body(transactionsService.getTransactionsById(id));
        }
    @PostMapping("/create/transactions")
    public ResponseEntity<Transactions> createTransactions(@RequestBody Transactions transactions) {
        return ResponseEntity.ok().body(this.transactionsService.createTransactions(transactions));
    }
    @PutMapping("/put/ransactions/{id}")
    public ResponseEntity<Transactions> updateTransactions(@PathVariable long id, @RequestBody Transactions transactions) {
        transactions.setId(id);
        return ResponseEntity.ok().body(this.transactionsService.updateTransactions(transactions));
       }
    }

