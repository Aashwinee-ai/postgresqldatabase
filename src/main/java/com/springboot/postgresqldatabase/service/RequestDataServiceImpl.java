package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.exception.ResourceNotFoundException;
import com.springboot.postgresqldatabase.model.RequestData;
import com.springboot.postgresqldatabase.model.User;
import com.springboot.postgresqldatabase.repository.RequestDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RequestDataServiceImpl implements RequestDataService {

   @Autowired
   private RequestDataRepository requestDataRepository;

    @Override
    public RequestData createRequestData(RequestData requestData) {

        return requestDataRepository.save(requestData);
    }

    @Override
    public RequestData updateRequestData(RequestData requestData) {
        Optional<RequestData> requestDataDb = this.requestDataRepository.findById(requestData.getId());
        if (requestDataDb.isPresent()) {
            RequestData requestDataUpdate = requestDataDb.get();
            requestDataUpdate.setId(requestData.getId());
            requestDataUpdate.setValidID(requestData.getValidID());
            requestDataUpdate.setPhoneNumber(requestData.getPhoneNumber());
            requestDataUpdate.setEmail(requestData.getEmail());
            requestDataUpdate.setBankAccountNUmber(requestData.getBankAccountNUmber());
            requestDataUpdate.setPrePaidCard(requestData.getPrePaidCard());
            requestDataUpdate.setPhoto(requestData.getPhoto());
            requestDataUpdate.setSignature(requestData.getSignature());
            requestDataUpdate.setProofOfAddress(requestData.getProofOfAddress());
            requestDataUpdate.setApplicationForm(requestData.getApplicationForm());
            requestDataUpdate.setEditButton(requestData.getEditButton());
            requestDataUpdate.setSubmitButton(requestData.getSubmitButton());
            requestDataRepository.save(requestDataUpdate);
            return requestDataUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + requestData.getId());
        }

    }

    @Override
    public List<RequestData> getAllRequestData() {

        return this.requestDataRepository.findAll();
    }

    @Override
    public RequestData getRequestDataById(long id) {
        Optional<RequestData> requestDataDb = this.requestDataRepository.findById(id);
        if(requestDataDb.isPresent()) {
            return requestDataDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id :" + id);
        }

    }

    @Override
    public void deleteRequestData(long id) {
     Optional<RequestData> requestDataDb = this.requestDataRepository.findById(id);

     if(requestDataDb.isPresent()) {
         this.requestDataRepository.delete(requestDataDb.get());
     } else {
         throw new ResourceNotFoundException("Record not found with id :" + id);
     }
    }
}