package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.model.Merchant;

import java.util.List;

public interface MerchantService {
    Merchant createMerchant(Merchant merchant);

    Merchant updateMerchant(Merchant merchant);

    List< Merchant > getAllMerchant();

    Merchant getMerchantById(long merchant);

    void deleteMerchant(long id);
}
