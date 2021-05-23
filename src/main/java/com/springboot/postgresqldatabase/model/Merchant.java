package com.springboot.postgresqldatabase.model;

import javax.persistence.*;

@Entity
@Table(name = "Merchant")
public class Merchant {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "valid_id")
    private String ValidID;
    @Column(name = "phone_number")
    private String PhoneNumber;
    @Column(name = "email")
    private String Email;
    @Column(name = "bank_account_number")
    private String BankAccountNUmber;
    @Column(name = "prepaidcard")
    private String PrePaidCard;
    @Column(name = "photo")
    private String Photo;
    @Column(name = "signature")
    private String Signature;
    @Column(name = "proofofaddress")
    private String ProofOfAddress;
    @Column(name = "applicationform")
    private String ApplicationForm;
    @Column(name = "edit_button")
    private String EditButton;
    @Column(name = "submit_button")
    private String SubmitButton;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getValidID() {
        return ValidID;
    }

    public void setValidID(String validID) {
        ValidID = validID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getBankAccountNUmber() {
        return BankAccountNUmber;
    }

    public void setBankAccountNUmber(String bankAccountNUmber) {
        BankAccountNUmber = bankAccountNUmber;
    }

    public String getPrePaidCard() {
        return PrePaidCard;
    }

    public void setPrePaidCard(String prePaidCard) {
        PrePaidCard = prePaidCard;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public String getProofOfAddress() {
        return ProofOfAddress;
    }

    public void setProofOfAddress(String proofOfAddress) {
        ProofOfAddress = proofOfAddress;
    }

    public String getApplicationForm() {
        return ApplicationForm;
    }

    public void setApplicationForm(String applicationForm) {
        ApplicationForm = applicationForm;
    }

    public String getEditButton() {
        return EditButton;
    }

    public void setEditButton(String editButton) {
        EditButton = editButton;
    }

    public String getSubmitButton() {
        return SubmitButton;
    }

    public void setSubmitButton(String submitButton) {
        SubmitButton = submitButton;
    }
}
