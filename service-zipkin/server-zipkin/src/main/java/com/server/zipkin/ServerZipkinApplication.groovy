package com.server.zipkin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import zipkin.server.EnableZipkinServer

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
@EnableZipkinServer
class ServerZipkinApplication {

    static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class,args)
    }
}
