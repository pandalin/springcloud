package com.eureka.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 9:22
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
class EurekaServerApplication {

    static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args)
    }
}
