package com.aurora.test.dubbo.consumer;

import com.aurora.test.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 设置降级内容，容错模式
    @Reference(mock = "com.aurora.test.dubbo.consumer.MockHelloServiceImpl", cluster = "failfast")
//    @Reference
    private HelloService helloService;

    @GetMapping("greet")
    public String greet() {
        return helloService.sayHello("woodpecker");
    }
}
