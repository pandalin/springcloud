package com.consul.server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/23
 * @time 16:26
 * @version 1.0
 */
@RestController
class ConsulServerController {

    @GetMapping('/consul-server-hi')
    def hi() {
        'hi consul'
    }
}
