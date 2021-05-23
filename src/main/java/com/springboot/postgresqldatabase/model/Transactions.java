package com.springboot.postgresqldatabase.model;

import javax.persistence.*;

@Entity
@Table
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "customer_registration")
    private String CustomerRegistration;
    @Column(name = "account_opening")
    private String AccountOpening;
    @Column(name  = "balance_checks")
    private String BalanceChecks;
    @Column(name  = "micro_insurance")
    private String MicroInsurance;
    @Column(name = "cash_in")
    private String CashIn;
    @Column(name = "cash_out")
    private String CashOut;
    @Column(name = "remittances")
    private String Remittances;
    @Column(name = "transfers")
    private String Transfers;
    @Column(name = "pre_approved_nano_loans")
    private String PreApprovedNanoLoans;
    @Column(name = "bill_payments")
    private String BillPayments;
    @Column(name = "air_time_top_up")
    private String AirTimeTopUp;
    @Column(name = "mini_statements")
    private String MiniStatements;

    public Transactions() {

    }
    public Transactions(long id, String accountOpening, String balanceChecks, String microInsurance, String cashIn, String cashOut, String remittances, String transfers, String preApprovedNanoLoans, String billPayments, String airTimeTopUp, String miniStatements, String customerRegistration) {
        this.id = id;
        AccountOpening = accountOpening;
        BalanceChecks = balanceChecks;
        MicroInsurance = microInsurance;
        CashIn = cashIn;
        CashOut = cashOut;
        Remittances = remittances;
        Transfers = transfers;
        PreApprovedNanoLoans = preApprovedNanoLoans;
        BillPayments = billPayments;
        AirTimeTopUp = airTimeTopUp;
        MiniStatements = miniStatements;
        CustomerRegistration = customerRegistration;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountOpening() {
        return AccountOpening;
    }

    public void setAccountOpening(String accountOpening) {
        AccountOpening = accountOpening;
    }

    public String getBalanceChecks() {
        return BalanceChecks;
    }

    public void setBalanceChecks(String balanceChecks) {
        BalanceChecks = balanceChecks;
    }

    public String getMicroInsurance() {
        return MicroInsurance;
    }

    public void setMicroInsurance(String microInsurance) {
        MicroInsurance = microInsurance;
    }

    public String getCashIn() {
        return CashIn;
    }

    public void setCashIn(String cashIn) {
        CashIn = cashIn;
    }

    public String getCashOut() {
        return CashOut;
    }

    public void setCashOut(String cashOut) {
        CashOut = cashOut;
    }

    public String getRemittances() {
        return Remittances;
    }

    public void setRemittances(String remittances) {
        Remittances = remittances;
    }

    public String getTransfers() {
        return Transfers;
    }

    public void setTransfers(String transfers) {
        Transfers = transfers;
    }

    public String getPreApprovedNanoLoans() {
        return PreApprovedNanoLoans;
    }

    public void setPreApprovedNanoLoans(String preApprovedNanoLoans) {
        PreApprovedNanoLoans = preApprovedNanoLoans;
    }

    public String getBillPayments() {
        return BillPayments;
    }

    public void setBillPayments(String billPayments) {
        BillPayments = billPayments;
    }

    public String getAirTimeTopUp() {
        return AirTimeTopUp;
    }

    public void setAirTimeTopUp(String airTimeTopUp) {
        AirTimeTopUp = airTimeTopUp;
    }

    public String getMiniStatements() {
        return MiniStatements;
    }

    public void setMiniStatements(String miniStatements) {
        MiniStatements = miniStatements;
    }

    public String getCustomerRegistration() {
        return CustomerRegistration;
    }

    public void setCustomerRegistration(String customerRegistration) {
        CustomerRegistration = customerRegistration;
    }



}
