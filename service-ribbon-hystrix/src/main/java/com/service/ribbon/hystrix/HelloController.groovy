package com.service.ribbon.hystrix

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

import javax.annotation.Resource

/**
 * Created by IntelliJ IDEA
 * <p>〈关闭eureka-client时，将调用@see hystrixFallBack方法〉 </p>
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
    @HystrixCommand(fallbackMethod = 'hystrixFallBack')
    def sayHi(String name) {
        restTemplate.getForObject('http://SERVICE-HI/hi?name=' + name, String.class)
    }

    def hystrixFallBack(String name) {
        name + 'hystrix fallback say error'
    }
}
