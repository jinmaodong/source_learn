package com.mdjin.eurekaclientprovider.controller;

import com.mdjin.eurekaclientprovider.dto.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
@Api(tags = "hello服务接口")
@RestController
public class ClassController {

    @ApiOperation(value = "对用户说你好!",notes = "接收外部调用，显示用户信息.")
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
//        return "Hello," + name;
        return "Hello,"+user.getName()+",your id is: "+user.getId()+" ,your age is: "+user.getAge();
    }

}
