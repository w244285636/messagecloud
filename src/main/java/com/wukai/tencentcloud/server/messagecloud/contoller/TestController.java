package com.wukai.tencentcloud.server.messagecloud.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/welcome")
    public String welcome(){
        return "hello world";
    }

}
