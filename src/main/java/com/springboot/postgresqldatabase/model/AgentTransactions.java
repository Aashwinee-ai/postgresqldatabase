package com.springboot.postgresqldatabase.model;

import javax.persistence.*;

@Entity
@Table
public class AgentTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name  = "agent_management")
    private String AgentManagement;
    @Column(name = "sub_agent_accounts")
    private String SubAgentAccounts;
    @Column(name = "making_deposits")
    private String MakingDeposits;
    @Column(name = "air_time_top_up")
    private String AirTimeTopUp;
    @Column(name = "bill_payments")
    private String BillPayments;
    @Column(name = "loan_applications")
    private String LoanApplications;
    @Column(name  = "remote_account_opening")
    private String RemoteAccountOpening;

    public AgentTransactions() {

    }
    public AgentTransactions(long id, String agentManagement, String subAgentAccounts, String makingDeposits, String airTimeTopUp, String billPayments, String loanApplications, String remoteAccountOpening, String agentAccoountsManagement, String agentFloatManagement, String commissionManagement, String structuredReporting) {
        Id = id;
        AgentManagement = agentManagement;
        SubAgentAccounts = subAgentAccounts;
        MakingDeposits = makingDeposits;
        AirTimeTopUp = airTimeTopUp;
        BillPayments = billPayments;
        LoanApplications = loanApplications;
        RemoteAccountOpening = remoteAccountOpening;
        AgentAccoountsManagement = agentAccoountsManagement;
        AgentFloatManagement = agentFloatManagement;
        CommissionManagement = commissionManagement;
        StructuredReporting = structuredReporting;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAgentManagement() {
        return AgentManagement;
    }

    public void setAgentManagement(String agentManagement) {
        AgentManagement = agentManagement;
    }

    public String getSubAgentAccounts() {
        return SubAgentAccounts;
    }

    public void setSubAgentAccounts(String subAgentAccounts) {
        SubAgentAccounts = subAgentAccounts;
    }

    public String getMakingDeposits() {
        return MakingDeposits;
    }

    public void setMakingDeposits(String makingDeposits) {
        MakingDeposits = makingDeposits;
    }

    public String getAirTimeTopUp() {
        return AirTimeTopUp;
    }

    public void setAirTimeTopUp(String airTimeTopUp) {
        AirTimeTopUp = airTimeTopUp;
    }

    public String getBillPayments() {
        return BillPayments;
    }

    public void setBillPayments(String billPayments) {
        BillPayments = billPayments;
    }

    public String getLoanApplications() {
        return LoanApplications;
    }

    public void setLoanApplications(String loanApplications) {
        LoanApplications = loanApplications;
    }

    public String getRemoteAccountOpening() {
        return RemoteAccountOpening;
    }

    public void setRemoteAccountOpening(String remoteAccountOpening) {
        RemoteAccountOpening = remoteAccountOpening;
    }

    public String getAgentAccoountsManagement() {
        return AgentAccoountsManagement;
    }

    public void setAgentAccoountsManagement(String agentAccoountsManagement) {
        AgentAccoountsManagement = agentAccoountsManagement;
    }

    public String getAgentFloatManagement() {
        return AgentFloatManagement;
    }

    public void setAgentFloatManagement(String agentFloatManagement) {
        AgentFloatManagement = agentFloatManagement;
    }

    public String getCommissionManagement() {
        return CommissionManagement;
    }

    public void setCommissionManagement(String commissionManagement) {
        CommissionManagement = commissionManagement;
    }

    public String getStructuredReporting() {
        return StructuredReporting;
    }

    public void setStructuredReporting(String structuredReporting) {
        StructuredReporting = structuredReporting;
    }

    @Column(name = "agent_accounts_management")
    private String AgentAccoountsManagement;
    @Column(name = "agent_float_management")
    private String AgentFloatManagement;
    @Column(name = "commission_management")
    private String CommissionManagement;
    @Column(name = "structured_reporting")
    private String StructuredReporting;
}
