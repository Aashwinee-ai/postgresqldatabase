package com.springboot.postgresqldatabase.controller;

import com.springboot.postgresqldatabase.model.AgentNetworkManagement;
import com.springboot.postgresqldatabase.model.Merchant;
import com.springboot.postgresqldatabase.service.AgentNetworkManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private AgentNetworkManagementService agentNetworkManagementService;

    @GetMapping("/dashboard")
    ResponseEntity<String> dashboard() {
        return new ResponseEntity<>("dashboard!", HttpStatus.OK);
    }
    @GetMapping("/systemusermanagement")
    ResponseEntity<String> systemusermanagement() {
        return new ResponseEntity<>("systemusermanagement!", HttpStatus.OK);
    }
    @GetMapping("/rolesandpermissionmanagement")
    ResponseEntity<String> rolesandpermissionmanagement() {
        return new ResponseEntity<>("rolesandpermissionmanagement!", HttpStatus.OK);
    }
    @GetMapping("/liquiditymanagement")
    ResponseEntity<String> liquiditymanagement() {
        return new ResponseEntity<>("liquiditymanagement!", HttpStatus.OK);
    }
    @GetMapping("/commissionpayment")
    ResponseEntity<String> commissionpayment() {
        return new ResponseEntity<>("commissionpayment!", HttpStatus.OK);
    }
    @GetMapping("/settlements")
    ResponseEntity<String> settlements() {
        return new ResponseEntity<>("settlements!", HttpStatus.OK);
    }
    @GetMapping("/revenuemanagement")
    ResponseEntity<String> revenuemanagement() {
        return new ResponseEntity<>("revenuemanagement!", HttpStatus.OK);
    }
    @GetMapping("/analytics")
    ResponseEntity<String> analytics() {
        return new ResponseEntity<>("analytics!", HttpStatus.OK);
    }
    @GetMapping("/ticketmanagement")
    ResponseEntity<String> ticketmanagement() {
        return new ResponseEntity<>("ticketmanagement!", HttpStatus.OK);
    }
    @GetMapping("/accesshistory")
    ResponseEntity<String> accesshistory() {
        return new ResponseEntity<>("accesshistory!", HttpStatus.OK);
    }
    @GetMapping("/kyc")
    ResponseEntity<String> kyc() {
        return new ResponseEntity<>("kyc!", HttpStatus.OK);
    }
    @GetMapping("/userprofilemanagement")
    ResponseEntity<String> userprofilemanagement() {
        return new ResponseEntity<>("userprofilemanagement", HttpStatus.OK);
    }











}
