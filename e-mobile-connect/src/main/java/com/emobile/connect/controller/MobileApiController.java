package com.emobile.connect.controller;

import com.emobile.connect.model.Response;
import com.emobile.connect.model.UserDetails;
import com.emobile.connect.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MobileApiController {

    @Autowired
    private UserDetailService userDetailService;

    @RequestMapping(value = "/createConnection", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> createNewConnection(@RequestBody UserDetails userDetails){
    	Response response = userDetailService.createNewConnection(userDetails);
       
        return ResponseEntity.ok().body(response);
    }
}
