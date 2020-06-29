package com.example.springboot_dubbo_server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springboot_dubbo_server.service.HelloService;

/**
 * @description:
 * @author: DreamflyChen
 * @create: 2020-06-27 20:42
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String SayHello(String name) {
        return "Hello , "+name;
    }
}
