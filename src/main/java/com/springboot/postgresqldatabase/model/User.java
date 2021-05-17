package com.springboot.postgresqldatabase.model;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long User_ID;
    @Column(name = "first_name")
    private String First_Name;
    @Column(name = "middle_name")
    private String Middle_Name;
    @Column(name = "last_name")
    private String Last_Name;
    @Column(name = "config_id")
    private String Config_ID;
    @Column(name = "uin")
    private String UIN;
    @Column(name = "dob")
    private String DOB;
    @Column(name = "address_id")
    private String Address_ID;
    @Column(name = "email")
    private String Email;
    @Column(name = "phone_number")
    private String Phone_Number;
    @Column(name = "doc_id")
    private String DOC_ID;
    @Column(name = "password")
    private String Password;
    @Column(name = "referer_id")
    private String Referer_ID;
    @Column(name = "is_verified")
    private Boolean Is_Verified;
    @Column(name = "is_active")
    private Boolean Is_Active;
    @Column(name = "created_timestamp")
    private Date Created_Timestamp;
    @Column(name = "modified_timestamp")
    private Date Modified_Timestamp;

    public Long getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(Long user_ID) {
        User_ID = user_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getMiddle_Name() {
        return Middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        Middle_Name = middle_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getConfig_ID() {
        return Config_ID;
    }

    public void setConfig_ID(String config_ID) {
        Config_ID = config_ID;
    }

    public String getUIN() {
        return UIN;
    }

    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress_ID() {
        return Address_ID;
    }

    public void setAddress_ID(String address_ID) {
        Address_ID = address_ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getDOC_ID() {
        return DOC_ID;
    }

    public void setDOC_ID(String DOC_ID) {
        this.DOC_ID = DOC_ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getReferer_ID() {
        return Referer_ID;
    }

    public void setReferer_ID(String referer_ID) {
        Referer_ID = referer_ID;
    }

    public Boolean getIs_Verified() { return Is_Verified; }

    public void setIs_Verified(Boolean is_Verified) { Is_Verified = is_Verified; }

    public Boolean getIs_Active() { return Is_Active; }

    public void setIs_Active(Boolean is_Active) { Is_Active = is_Active; }

    public Date getCreated_Timestamp() { return Created_Timestamp; }

    public void setCreated_Timestamp(Date created_Timestamp) { Created_Timestamp = created_Timestamp; }

    public Date getModified_Timestamp() { return Modified_Timestamp; }

    public void setModified_Timestamp(Date modified_Timestamp) { Modified_Timestamp = modified_Timestamp; }

}
