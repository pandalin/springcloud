package com.consul.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/23
 * @time 16:25
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
class ConsulServerApplication {

    static void main(String[] args) {
        SpringApplication.run(ConsulServerApplication.class,args)
    }
}
