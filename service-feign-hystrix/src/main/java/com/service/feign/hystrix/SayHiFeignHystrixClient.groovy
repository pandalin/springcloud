package com.service.feign.hystrix

import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestParam

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/6/22
 * @time 14:38
 * @version 1.0
 */
@Component
class SayHiFeignHystrixClient implements SayHiFeignClient{

    @Override
    String sayHi(@RequestParam("name") String name) {
        return 'SayHiFeignHystrixClient say ' + name + ' error'
    }
}
