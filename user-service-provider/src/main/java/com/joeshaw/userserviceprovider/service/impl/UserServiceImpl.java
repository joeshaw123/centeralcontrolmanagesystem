package com.joeshaw.userserviceprovider.service.impl;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.joeshaw.userserviceprovider.domain.User;
import com.joeshaw.userserviceprovider.mapper.UserMapper;
import com.joeshaw.userserviceprovider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class  UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findUser(String username, String password) {
        QueryWrapper wrapper = new QueryWrapper();
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("nickName",username);
        paramMap.put("password",password);
        wrapper.allEq(paramMap);
        return userMapper.selectOne(wrapper);
    }
}
