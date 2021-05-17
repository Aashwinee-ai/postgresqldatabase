package com.springboot.postgresqldatabase.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Agent_ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @JsonIgnore
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id")
    @JsonIgnore
    private Agency agency;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "allowance_id", referencedColumnName = "allowance_id")
    @JsonIgnore
    private Allowance allowance;

    @Column(name = "is_verified")
    private Boolean is_Verified;
    @Column(name = "is_Active")
    private Boolean is_Active;
    @Column(name = "modified_timestamp")
    private Date Modified_Timestamp;
    @Column(name = "created_timestamp")
    private Date Created_Timestamp;

    public Long getAgent_ID() {
        return Agent_ID;
    }

    public void setAgent_ID(Long agent_ID) {
        Agent_ID = agent_ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Allowance getAllowance() {
        return allowance;
    }

    public void setAllowance(Allowance allowance) {
        this.allowance = allowance;
    }

    public Boolean getIs_Verified() {
        return is_Verified;
    }

    public void setIs_Verified(Boolean is_Verified) {
        this.is_Verified = is_Verified;
    }

    public Boolean getIs_Active() {
        return is_Active;
    }

    public void setIs_Active(Boolean is_Active) {
        this.is_Active = is_Active;
    }

    public Date getModified_Timestamp() {
        return Modified_Timestamp;
    }

    public void setModified_Timestamp(Date modified_Timestamp) {
        Modified_Timestamp = modified_Timestamp;
    }

    public Date getCreated_Timestamp() {
        return Created_Timestamp;
    }

    public void setCreated_Timestamp(Date created_Timestamp) {
        Created_Timestamp = created_Timestamp;
    }
}
