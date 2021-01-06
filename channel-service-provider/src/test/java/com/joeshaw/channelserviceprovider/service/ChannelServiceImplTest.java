package com.joeshaw.channelserviceprovider.service;

import com.joeshaw.channelserviceprovider.domain.Channel;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChannelServiceImplTest extends TestCase {
    @Autowired
    ChannelService channelService;

    @Test
    public void testFindAll(){
        List<Channel> all = channelService.findAll();
        System.out.println(all);
    }

}