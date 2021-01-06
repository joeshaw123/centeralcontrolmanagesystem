package com.joeshaw.channelserviceprovider.service;

import com.joeshaw.channelserviceprovider.domain.Channel;

import java.util.List;

public interface ChannelService {
    List<Channel> findAll();
}
