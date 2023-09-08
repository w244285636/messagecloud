package com.wukai.tencentcloud.server.messagecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagecloudApplication {

	public static void main(String[] args) {
		System.out.println("server is start");
		SpringApplication.run(MessagecloudApplication.class, args);
	}

}
