package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.exception.ResourceNotFoundException;
import com.springboot.postgresqldatabase.model.Merchant;
import com.springboot.postgresqldatabase.model.RequestData;
import com.springboot.postgresqldatabase.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantRepository merchantRepository;

    @Override
    public Merchant createMerchant(Merchant merchant)  {
        return merchantRepository.save(merchant);
    }

    @Override
    public Merchant updateMerchant(Merchant merchant) {
        Optional<Merchant> merchantDb = this.merchantRepository.findById(merchant.getId());
        if (merchantDb.isPresent()) {
            Merchant merchantUpdate = merchantDb.get();
            merchantUpdate.setId(merchant.getId());
            merchantUpdate.setValidID(merchant.getValidID());
            merchantUpdate.setPhoneNumber(merchant.getPhoneNumber());
            merchantUpdate.setEmail(merchant.getEmail());
            merchantUpdate.setBankAccountNUmber(merchant.getBankAccountNUmber());
            merchantUpdate.setPrePaidCard(merchant.getPrePaidCard());
            merchantUpdate.setPhoto(merchant.getPhoto());
            merchantUpdate.setSignature(merchant.getSignature());
            merchantUpdate.setProofOfAddress(merchant.getProofOfAddress());
            merchantUpdate.setApplicationForm(merchant.getApplicationForm());
            merchantUpdate.setEditButton(merchant.getEditButton());
            merchantUpdate.setSubmitButton(merchant.getSubmitButton());
            merchantRepository.save(merchantUpdate);
            return merchantUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + merchant.getId());
        }

    }

    @Override
    public List<Merchant> getAllMerchant() {
        return this.merchantRepository.findAll();
    }

    @Override
    public Merchant getMerchantById(long id) {
        Optional<Merchant> merchantDb = this.merchantRepository.findById(id);
        if (merchantDb.isPresent()) {
            return merchantDb.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id :" + id));
        }

    }

    @Override
    public void deleteMerchant(long id) {
        Optional<Merchant> merchantDb = this.merchantRepository.findById(id);

        if (merchantDb.isPresent()) {
            this.merchantRepository.delete(merchantDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id :" + id);
        }
    }

}
