package com.aurora.test.dubbo.consumer;

import com.aurora.test.HelloService;

public class MockHelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String s) {
        return "服务降级测试";
    }
}
