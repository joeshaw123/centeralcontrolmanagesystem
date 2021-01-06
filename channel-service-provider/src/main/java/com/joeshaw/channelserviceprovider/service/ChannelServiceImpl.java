package com.joeshaw.channelserviceprovider.service;

import com.joeshaw.channelserviceprovider.domain.Channel;
import com.joeshaw.channelserviceprovider.mapper.ChannelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements  ChannelService{
    @Autowired
    ChannelMapper channelMapper;

    @Override
    public List<Channel> findAll() {
        return channelMapper.selectList(null);
    }
}
