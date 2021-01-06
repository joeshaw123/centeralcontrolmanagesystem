package com.joeshaw.channelserviceprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.joeshaw.channelserviceprovider.mapper")
public class ChannelServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChannelServiceProviderApplication.class, args);
	}

}
