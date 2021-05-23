package com.springboot.postgresqldatabase.model;

import javax.persistence.*;

@Entity
@Table
public class SystemAdminTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "agent_management")
    private String agentmanagement;
    @Column(name = "account_management")
    private String accountmanagement;
    @Column(name = "transaaction_management")
    private String transactionmanagement;
    @Column(name = "liquidity_management")
    private String liquiditymanagement;
    @Column(name = "transaction_limit_management")
    private String transactionlimitmanagement;
    @Column(name  = "transaction_chargers")
    private String transactionchargers;
    @Column(name  = "commission_management")
    private String commissionmanagement;
    @Column(name = "transaction_reconcilliation_module")
    private String transactionreconcilliationmodule;
    @Column(name = "posting_transaction")
    private String postingtransaction;
    @Column(name = "client_transaction_limit")
    private String clienttransactionlimit;
    @Column(name = "daily_limit_management")
    private String dailylimitmanagement;


    public SystemAdminTransactions() {

    }

    public SystemAdminTransactions( String agentmanagement, String accountmanagement, String transactionmanagement, String liquiditymanagement, String transactionlimitmanagement, String transactionchargers, String commissionmanagement, String transactionreconcilliationmodule, String postingtransaction, String clienttransactionlimit, String dailylimitmanagement) {
        this.agentmanagement = agentmanagement;
        this.accountmanagement = accountmanagement;
        this.transactionmanagement = transactionmanagement;
        this.liquiditymanagement = liquiditymanagement;
        this.transactionlimitmanagement = transactionlimitmanagement;
        this.transactionchargers = transactionchargers;
        this.commissionmanagement = commissionmanagement;
        this.transactionreconcilliationmodule = transactionreconcilliationmodule;
        this.postingtransaction = postingtransaction;
        this.clienttransactionlimit = clienttransactionlimit;
        this.dailylimitmanagement = dailylimitmanagement;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAgentmanagement() {
        return agentmanagement;
    }

    public void setAgentmanagement(String agentmanagement) {
        this.agentmanagement = agentmanagement;
    }

    public String getAccountmanagement() {
        return accountmanagement;
    }

    public void setAccountmanagement(String accountmanagement) {
        this.accountmanagement = accountmanagement;
    }

    public String getTransactionmanagement() {
        return transactionmanagement;
    }

    public void setTransactionmanagement(String transactionmanagement) {
        this.transactionmanagement = transactionmanagement;
    }

    public String getLiquiditymanagement() {
        return liquiditymanagement;
    }

    public void setLiquiditymanagement(String liquiditymanagement) {
        this.liquiditymanagement = liquiditymanagement;
    }

    public String getTransactionlimitmanagement() {
        return transactionlimitmanagement;
    }

    public void setTransactionlimitmanagement(String transactionlimitmanagement) {
        this.transactionlimitmanagement = transactionlimitmanagement;
    }

    public String getTransactionchargers() {
        return transactionchargers;
    }

    public void setTransactionchargers(String transactionchargers) {
        this.transactionchargers = transactionchargers;
    }

    public String getCommissionmanagement() {
        return commissionmanagement;
    }

    public void setCommissionmanagement(String commissionmanagement) {
        this.commissionmanagement = commissionmanagement;
    }

    public String getTransactionreconcilliationmodule() {
        return transactionreconcilliationmodule;
    }

    public void setTransactionreconcilliationmodule(String transactionreconcilliationmodule) {
        this.transactionreconcilliationmodule = transactionreconcilliationmodule;
    }

    public String getPostingtransaction() {
        return postingtransaction;
    }

    public void setPostingtransaction(String postingtransaction) {
        this.postingtransaction = postingtransaction;
    }

    public String getClienttransactionlimit() {
        return clienttransactionlimit;
    }

    public void setClienttransactionlimit(String clienttransactionlimit) {
        this.clienttransactionlimit = clienttransactionlimit;
    }

    public String getDailylimitmanagement() {
        return dailylimitmanagement;
    }

    public void setDailylimitmanagement(String dailylimitmanagement) {
        this.dailylimitmanagement = dailylimitmanagement;
    }
}
