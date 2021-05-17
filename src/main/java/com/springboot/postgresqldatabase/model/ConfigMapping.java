package com.springboot.postgresqldatabase.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

@Entity
@Table(name = "config_mapping")
public class ConfigMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Config_ID;
    @Column(name = "terms_and_conditions")
    private String Terms_andConditions;
    @Column(name = "password_policies")
    private String Password_Policies;
    @Column(name = "status")
    private String Status;
    @Column(name = "created_timestamp")
    private String Created_Timestamp;
    @Column(name = "updated_timestamp")
    private String Updated_Timestamp;

    public Long getConfig_ID() {
        return Config_ID;
    }

    public void setConfig_ID(Long config_ID) {
        Config_ID = config_ID;
    }

    public String getTerms_andConditions() {
        return Terms_andConditions;
    }

    public void setTerms_andConditions(String terms_andConditions) {
        Terms_andConditions = terms_andConditions;
    }

    public String getPassword_Policies() {
        return Password_Policies;
    }

    public void setPassword_Policies(String password_Policies) {
        Password_Policies = password_Policies;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getCreated_Timestamp() {
        return Created_Timestamp;
    }

    public void setCreated_Timestamp(String created_Timestamp) {
        Created_Timestamp = created_Timestamp;
    }

    public String getUpdated_Timestamp() {
        return Updated_Timestamp;
    }

    public void setUpdated_Timestamp(String updated_Timestamp) {
        Updated_Timestamp = updated_Timestamp;
    }

}
