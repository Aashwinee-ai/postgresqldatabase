package com.springboot.postgresqldatabase.service;

import com.springboot.postgresqldatabase.model.Agent;
import com.springboot.postgresqldatabase.model.RequestData;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RequestDataService {

    RequestData createRequestData(RequestData requestData);

    RequestData updateRequestData(RequestData requestData);

    List< RequestData > getAllRequestData();

    RequestData getRequestDataById(long requestData);

    void deleteRequestData(long id);
}
