package com.config.client.eureka.bus.amqp

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 18:07
 * @version 1.0
 */
@RestController
@RefreshScope
class ConfigClientEurekaBusController {

    @Value('${username}')
    String username

    @Value('${password}')
    String password

    @GetMapping('/getUserName')
    def getUserName() {
        'config server eureka bus amqp response: username={' + username + '},password={' + password + '}'
    }
}
