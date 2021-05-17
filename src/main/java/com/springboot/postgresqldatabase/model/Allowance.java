package com.springboot.postgresqldatabase.model;

import javax.persistence.*;

@Entity
@Table(name = "allowance")
public class Allowance {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long Allowance_ID;

    @Column(name = "daily_limit")
    private Long Daily_Limit;
    @Column(name = "monthly_limit")
    private Double Monthly_Limit;


    public Long getAllowance_ID() {
        return Allowance_ID;
    }

    public void setAllowance_ID(Long allowance_ID) {
        Allowance_ID = allowance_ID;
    }

    public Long getDaily_Limit() {
        return Daily_Limit;
    }

    public void setDaily_Limit(Long daily_Limit) {
        Daily_Limit = daily_Limit;
    }

    public Double getMonthly_Limit() {
        return Monthly_Limit;
    }

    public void setMonthly_Limit(Double monthly_Limit) {
        Monthly_Limit = monthly_Limit;
    }

}
