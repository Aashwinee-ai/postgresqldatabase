package com.springboot.postgresqldatabase.controller;

import com.springboot.postgresqldatabase.model.RequestData;
import com.springboot.postgresqldatabase.service.RequestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class RequestDataController {

    @Autowired
    private RequestDataService requestDataService;

   @GetMapping("/requestData")
    public ResponseEntity <List<RequestData>> getAllRequestData() {
       return ResponseEntity.ok().body(requestDataService.getAllRequestData());
   }

   @GetMapping("/requestData/{id}")
    public ResponseEntity<RequestData> getRequestDataById(@PathVariable long id) {
       return ResponseEntity.ok().body(requestDataService.getRequestDataById(id));
   }

   @PostMapping("/createrequestData")
    public ResponseEntity<RequestData> createRequestData(@RequestBody RequestData requestData) {
       return ResponseEntity.ok().body(this.requestDataService.createRequestData(requestData));
   }

   @PutMapping("/requestData/{id}")
    public ResponseEntity<RequestData> updateRequestData(@PathVariable long id, @RequestBody RequestData requestData) {
       requestData.setId(id);
       return ResponseEntity.ok().body(this.requestDataService.updateRequestData(requestData));
   }
}
