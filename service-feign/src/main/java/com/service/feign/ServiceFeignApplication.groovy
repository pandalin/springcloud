package com.service.feign

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
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
@RestController
class ServiceFeignApplication {

    static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }

    @Resource
    SayHiFeignClient sayHiFeignClient

    @GetMapping('/sayHi')
    def feign(String name) {
        'feign server response: ' + sayHiFeignClient.sayHi(name)
    }
}
