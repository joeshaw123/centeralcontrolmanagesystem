package com.joeshaw.userserviceprovider.service;

import com.joeshaw.userserviceprovider.domain.User;

public interface UserService {
    User findUser(String username,String password);
}
