package com.joeshaw.channelserviceprovider.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Channel {
    @TableId
    private String id;
    private String name;
    private String channelType;
    private Integer pollingDelay;
    private String ip;
    private Integer port;
    private String comport;
    private Integer baudrate;
    private String parity;
    private Integer dataBits;
    private Integer stopBits;

}
