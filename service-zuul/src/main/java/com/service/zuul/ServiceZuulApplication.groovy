package com.service.zuul

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 15:20
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
class ServiceZuulApplication {

    static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class,args)
    }
}
