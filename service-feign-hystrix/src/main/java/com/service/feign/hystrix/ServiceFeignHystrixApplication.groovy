package com.service.feign.hystrix

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.Resource

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 13:40
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@RestController
class ServiceFeignHystrixApplication {

    static void main(String[] args) {
        SpringApplication.run(ServiceFeignHystrixApplication.class, args);
    }

    @Resource
    SayHiFeignClient sayHiFeignClient

    @GetMapping('/service-feign-hystrix')
    def feign(String name) {
        sayHiFeignClient.sayHi(name)
    }
}
