package com.service.zipkin.second

import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
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
 * @time 18:51
 * @version 1.0
 */
@RestController
class ZipkinSecondController {

    @Resource
    private RestTemplate restTemplate

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate() {
        new RestTemplate()
    }

    @GetMapping('/zipkin-second')
    def first(String name) {
        restTemplate.getForObject('http://service-zipkin-first/hi?name=' + name,String.class)
    }
}
