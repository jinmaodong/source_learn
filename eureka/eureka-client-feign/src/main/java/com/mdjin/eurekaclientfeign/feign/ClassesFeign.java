package com.mdjin.eurekaclientfeign.feign;

import com.mdjin.eurekaclientfeign.dto.TsUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
     * @param user
     *  参数-用户
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String sayHello(@RequestBody TsUser user);
}
