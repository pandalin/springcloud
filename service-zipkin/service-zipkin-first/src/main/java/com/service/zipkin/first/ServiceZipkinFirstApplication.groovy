package com.service.zipkin.first

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 18:42
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
class ServiceZipkinFirstApplication {

    static void main(String[] args) {
        SpringApplication.run(ServiceZipkinFirstApplication.class,args)
    }
}
