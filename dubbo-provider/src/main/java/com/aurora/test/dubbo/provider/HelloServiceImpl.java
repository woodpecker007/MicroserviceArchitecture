package com.aurora.test.dubbo.provider;

import com.aurora.test.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;



/**
 * Dubbo 6种集群容错模式
 * 1.Failover Cluster（失败自动切换，默认重试2次）
 * 2.Failfast Cluster（快速失败，发起一次调用，调用失败立即报错）
 * 3.Failsafe Cluster（出现异常时直接忽略异常）
 * 4.Failback Cluster（失败后自动回复）
 * 5.Forking Cluster（并行调用集群中多个服务，只要其中一个成功就返回）
 * 6.Broadcast Cluster（广播调用所有服务提供者）
 * 配置方式：
 * @Service(cluster = "failfast")
 */

/**
 * Dubbo 4中负载均衡策略
 * 1.Random LoadBalance（随机算法，设置权重，权重越大随机的概率也越大）
 * 2.RoundRobin LoadBalance（轮询）
 * 3.LeastActive LoadBalance（最少活跃调用数，处理较慢的节点收到更少的请求）
 * 4.ConsistentHash LoadBalance（一致性Hash，相同参数的请求总是发送到同一个服务提供者）
 * 配置方式：
 * @Service(loadbalance = "roundrobin")
 */
//@Service(cluster = "failfast", loadbalance = "roundrobin")
@Service
public class HelloServiceImpl implements HelloService {

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public String sayHello(String s) {
        return String.format("「%s」say: hello, %s", applicationName, s);
    }
}
