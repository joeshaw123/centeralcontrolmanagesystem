package com.joeshaw.userserviceprovider.service.impl;

import com.joeshaw.userserviceprovider.domain.User;
import com.joeshaw.userserviceprovider.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest extends TestCase {
    @Autowired
    UserService userService;

    @Test
    public void findUser(){
        User user = userService.findUser("admin", "123456");
        System.out.println(user);
    }
}