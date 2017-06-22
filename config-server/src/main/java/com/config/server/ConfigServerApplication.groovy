package com.config.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 16:07
 * @version 1.0
 */
@SpringBootApplication
@EnableConfigServer
class ConfigServerApplication {

    static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args)
    }
}
