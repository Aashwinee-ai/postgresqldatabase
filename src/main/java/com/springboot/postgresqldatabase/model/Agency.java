package com.springboot.postgresqldatabase.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "agency")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Agency_ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName ="address_id")
    @JsonIgnore
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", referencedColumnName ="contact_id")
    @JsonIgnore
    private Contact contact;

    @Column(name = "agency_type")
    private String Agency_Type;
    @Column(name = "agency_domain")
    private String Agency_Domain;
    @Column(name = "doc_hash")
    private String DOC_Hash;
    @Column(name = "is_verified")
    private Boolean Is_Verified;
    @Column(name = "is_active")
    private Boolean Is_Active;
    @Column(name = "created_timestamp")
    private Date Created_Timestamp;
    @Column(name = "modified_timestamp")
    private Date Modified_Timestamp;

    public Long getAgency_ID() {
        return Agency_ID;
    }

    public void setAgency_ID(Long agency_ID) {
        Agency_ID = agency_ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getAgency_Type() {
        return Agency_Type;
    }

    public void setAgency_Type(String agency_Type) {
        Agency_Type = agency_Type;
    }

    public String getAgency_Domain() {
        return Agency_Domain;
    }

    public void setAgency_Domain(String agency_Domain) {
        Agency_Domain = agency_Domain;
    }

    public String getDOC_Hash() {
        return DOC_Hash;
    }

    public void setDOC_Hash(String DOC_Hash) {
        this.DOC_Hash = DOC_Hash;
    }

    public Boolean getIs_Verified() {
        return Is_Verified;
    }

    public void setIs_Verified(Boolean is_Verified) {
        Is_Verified = is_Verified;
    }

    public Boolean getIs_Active() {
        return Is_Active;
    }

    public void setIs_Active(Boolean is_Active) {
        Is_Active = is_Active;
    }

    public Date getCreated_Timestamp() {
        return Created_Timestamp;
    }

    public void setCreated_Timestamp(Date created_Timestamp) {
        Created_Timestamp = created_Timestamp;
    }

    public Date getModified_Timestamp() {
        return Modified_Timestamp;
    }

    public void setModified_Timestamp(Date modified_Timestamp) {
        Modified_Timestamp = modified_Timestamp;
    }

}
