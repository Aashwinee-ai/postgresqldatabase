package com.springboot.postgresqldatabase.model;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Contact_ID;
    @Column(name = "phone_number")
    private String Phone_number;
    @Column(name = "email")
    private String Email;
    @Column(name = "additional_field")
    private String Additional_field;

    public Long getContact_ID() {
        return Contact_ID;
    }

    public void setContact_ID(Long contact_ID) {
        Contact_ID = contact_ID;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAdditional_field() {
        return Additional_field;
    }

    public void setAdditional_field(String additional_field) {
        Additional_field = additional_field;
    }
}
