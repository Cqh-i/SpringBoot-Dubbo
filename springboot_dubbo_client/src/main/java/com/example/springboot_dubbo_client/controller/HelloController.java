package com.example.springboot_dubbo_client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springboot_dubbo_server.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @description:
 * @author: DreamflyChen
 * @create: 2020-06-27 21:53
 */
@Controller
public class HelloController {

    @Reference(version = "1.0.0")
    HelloService helloService;

    @ResponseBody
    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return helloService.SayHello(name);
    }
}
