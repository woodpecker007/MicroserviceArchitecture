package com.aurora.test.dubbo.provider;

import com.aurora.test.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

//@Service(cluster = "failfast", loadbalance = "roundrobin")

/**
 * 6种集群容错模式
 * 1.Failover Cluster（失败自动切换，默认重试2次）
 * 2.
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public String sayHello(String s) {
        return String.format("「%s」say: hello, %s", applicationName, s);
    }
}
