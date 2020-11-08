package com.emobile.connect.service;

import com.emobile.connect.model.Response;
import com.emobile.connect.model.UserDetails;
import com.emobile.connect.repository.UserDetailRepository;
import com.emobile.connect.util.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public Response createNewConnection(UserDetails userDetails) {
        userDetails.setRequestId(UUID.randomUUID().toString());
        userDetails.setRequestStatus(RequestStatus.IN_PROGRESS.getValue());
        UserDetails details = userDetailRepository.save(userDetails);
        Response response = new Response();
        response.setRequestId(details.getRequestId());
        response.setMessage("New Connection Created Successfully");
        return response;
    }
}
