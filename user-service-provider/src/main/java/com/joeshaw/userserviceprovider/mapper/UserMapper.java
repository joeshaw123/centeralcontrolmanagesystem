package com.joeshaw.userserviceprovider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.joeshaw.userserviceprovider.domain.User;

public interface UserMapper extends BaseMapper<User> {
    User selectOneById(int id);
}
