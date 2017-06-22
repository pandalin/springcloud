package com.service.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

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
@RestController
class ConfigClientApplication {

    static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args)
    }

    @Value('${username}')
    String username

    @Value('${password}')
    String password

    @GetMapping('/getUserName')
    def getUserName() {
        'config server response: username={' + username + '},password={' + password + '}'
    }
}
