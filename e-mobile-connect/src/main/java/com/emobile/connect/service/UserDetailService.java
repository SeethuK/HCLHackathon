package com.emobile.connect.service;

import com.emobile.connect.model.Response;
import com.emobile.connect.model.UserDetails;

public interface UserDetailService {
    public Response createNewConnection(UserDetails userDetails);
}
