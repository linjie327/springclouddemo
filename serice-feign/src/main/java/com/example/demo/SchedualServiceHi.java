package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by admin on 2018/11/28.
 */
//通过@ FeignClient（“服务名”），来指定调用哪个服务 比如在代码中调用了EUREKA-CLIENT服务的“/hi”接口，代码如下
@FeignClient(value = "EUREKA-CLIENT")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
