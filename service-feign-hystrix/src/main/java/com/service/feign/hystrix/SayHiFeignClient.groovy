package com.service.feign.hystrix

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 13:44
 * @version 1.0
 */
@FeignClient(value = 'service-hi',fallback = SayHiFeignHystrixClient.class)
interface SayHiFeignClient {

    @GetMapping(value = '/hi')
    String sayHi(@RequestParam("name") String name)
}