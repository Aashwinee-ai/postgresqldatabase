package com.springboot.postgresqldatabase.controller;

import com.springboot.postgresqldatabase.model.Merchant;
import com.springboot.postgresqldatabase.model.RequestData;
import com.springboot.postgresqldatabase.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private MerchantService merchantService;

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
    @GetMapping("/accesspolicymanagement")
    ResponseEntity<String> accesspolicymanagement() {
        return new ResponseEntity<>("accesspolicymanagement", HttpStatus.OK);
    }
    @GetMapping("/rulesmanagement")
    ResponseEntity<String> rulesmanagement() {
        return new ResponseEntity<>("rulesmanagement!", HttpStatus.OK);
    }

    @GetMapping("/businessunitmanagement")
    ResponseEntity<String> businessunitmanagement() {
        return new ResponseEntity<>("businessunitmanagement", HttpStatus.OK);
    }
    @GetMapping("/agentmanagement")
    ResponseEntity<String> transactions() {
        return new ResponseEntity<>("agentmanagement!", HttpStatus.OK);
    }

    @GetMapping("/merchantmanagement")
    public ResponseEntity<List<Merchant>> getAllRequestData() {
        return ResponseEntity.ok().body(merchantService.getAllMerchant());
    }
    @GetMapping("/merchantmanagement/{id}")
    public ResponseEntity<Merchant> getMerchantById(@PathVariable long id) {
        return ResponseEntity.ok().body(merchantService.getMerchantById(id));
    }
    @PostMapping("/createmerchantmanagement")
    public ResponseEntity<Merchant> createMerchant(@RequestBody Merchant merchant) {
        return ResponseEntity.ok().body(this.merchantService.createMerchant(merchant));
    }
    @PutMapping("/putmerchantmanagement/{id}")
    public ResponseEntity<Merchant> updateMerchant(@PathVariable long id, @RequestBody Merchant merchant) {
        merchant.setId(id);
        return ResponseEntity.ok().body(this.merchantService.updateMerchant(merchant));
    }

    @GetMapping("/clientmanagement")
    ResponseEntity<String> clientmanagement() {
        return new ResponseEntity<>("clientmanagement!", HttpStatus.OK);
    }

    @GetMapping("/feesmanagement")
    ResponseEntity<String> feesmanagement() {
        return new ResponseEntity<>("feesmanagement!", HttpStatus.OK);
    }

    @GetMapping("/commissionsmanagement")
    ResponseEntity<String> commissionsmanagement() {
        return new ResponseEntity<>("commissionsmanagement!", HttpStatus.OK);
    }
    @GetMapping("/transactionsmanagement")
    ResponseEntity<String> transactionsmanagement() {
        return new ResponseEntity<>("transactionsmanagement!", HttpStatus.OK);
    }

    @GetMapping("/walletmanagement")
    ResponseEntity<String> walletmanagement() {
        return new ResponseEntity<>("walletmanagement!", HttpStatus.OK);
    }

    @GetMapping("/currencymanagement")
    ResponseEntity<String> currencymanagement() {
        return new ResponseEntity<>("currencymanagement", HttpStatus.OK);
    }
    @GetMapping("/settlements")
    ResponseEntity<String> settlements() {
        return new ResponseEntity<>("settlements", HttpStatus.OK);
    }
    @GetMapping("/revenuemanagement")
    ResponseEntity<String> revenuemanagement() {
        return new ResponseEntity<>("revenuemanagement", HttpStatus.OK);
    }
    @GetMapping("/invoicemanagement")
    ResponseEntity<String> invoicemanagement() {
        return new ResponseEntity<>("invoicemanagement", HttpStatus.OK);
    }
    @GetMapping("/smstemplate")
    ResponseEntity<String> smstemplate() {
        return new ResponseEntity<>("smstemplate", HttpStatus.OK);
    }
    @GetMapping("/emailtemplate")
    ResponseEntity<String> emailtemplate() {
        return new ResponseEntity<>("emailtemplate", HttpStatus.OK);
    }
    @GetMapping("/ticketmanagement")
    ResponseEntity<String> ticketmanagement() {
        return new ResponseEntity<>("ticketmanagement", HttpStatus.OK);
    }
    @GetMapping("/kycvalidation")
    ResponseEntity<String> kycvalidation() {
        return new ResponseEntity<>("kycvalidation", HttpStatus.OK);
    }
    @GetMapping("/loggingandmonitoringconfiguration")
    ResponseEntity<String> loggingandmonitoringconfiguration() {
        return new ResponseEntity<>("loggingandmonitoringconfiguration", HttpStatus.OK);
    }
    @GetMapping("/tontinemanagement")
    ResponseEntity<String> tontinemanagement() {
        return new ResponseEntity<>("tontinemanagement", HttpStatus.OK);
    }
    @GetMapping("/cardmanagement")
    ResponseEntity<String> cardmanagement() {
        return new ResponseEntity<>("cardmanagement", HttpStatus.OK);
    }
    @GetMapping("/loyalitymanagement")
    ResponseEntity<String> loyalitymanagement() {
        return new ResponseEntity<>("loyalitymanagement", HttpStatus.OK);
    }
    @GetMapping("/Eventmanagement")
    ResponseEntity<String> Eventmanagement() {
        return new ResponseEntity<>("Eventmanagement", HttpStatus.OK);
    }
    @GetMapping("/electronicticketmanagement")
    ResponseEntity<String> electronicticketmanagement() {
        return new ResponseEntity<>("electronicticketmanagement", HttpStatus.OK);
    }
    @GetMapping("/onlinefraudriskmanagement")
    ResponseEntity<String> onlinefraudriskmanagement() {
        return new ResponseEntity<>("onlinefraudriskmanagement", HttpStatus.OK);
    }
    @GetMapping("/loanmanagement")
    ResponseEntity<String> loanmanagement() {
        return new ResponseEntity<>("loanmanagement", HttpStatus.OK);
    }
    @GetMapping("/analytics")
    ResponseEntity<String> analytics() {
        return new ResponseEntity<>("analytics", HttpStatus.OK);
    }
    @GetMapping("/accesshistory")
    ResponseEntity<String> accesshistory() {
        return new ResponseEntity<>("accesshistory", HttpStatus.OK);
    }
    @GetMapping("/settings")
    ResponseEntity<String> settings() {
        return new ResponseEntity<>("settings", HttpStatus.OK);
    }
    @GetMapping("/userprofilemanagement")
    ResponseEntity<String> userprofilemanagement() {
        return new ResponseEntity<>("userprofilemanagement", HttpStatus.OK);
    }



















}

