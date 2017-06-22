package com.eureka.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 9:47
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
class ServiceHiApplication {

    static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

    @Value('${server.port}')
    String port

    @RequestMapping("/hi")
    def hi(String name) {
        port + ':say hello ' + name
    }

}
