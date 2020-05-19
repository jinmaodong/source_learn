package com.mdjin.eurekaclientfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
@FeignClient(name = "service-client-provider")
public interface ClassesFeign {

    /**
     * 调用远端方法
     * @param name
     *  参数-名称
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name")String name);
}
