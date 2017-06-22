package com.service.ribbon

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

import javax.annotation.Resource

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 10:08
 * @version 1.0
 */
@RestController
class HelloController {

    @Resource
    RestTemplate restTemplate

    @GetMapping('/sayHi')
    def sayHi(String name) {
        'ribbon server response: ' + restTemplate.getForObject('http://SERVICE-HI/hi?name=' + name, String.class)
    }
}
