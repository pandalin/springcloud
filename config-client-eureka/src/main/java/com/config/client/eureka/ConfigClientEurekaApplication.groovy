package com.config.client.eureka

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
 * @time 16:42
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
class ConfigClientEurekaApplication {

    static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApplication.class,args)
    }

}
