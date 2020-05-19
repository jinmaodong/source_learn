package com.mdjin.eurekaclientprovider.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
@Api(tags = "hello服务接口")
@RestController
public class ClassController {

    @ApiOperation("对用户说你好!")
    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name){
        return "Hello,"+name;
    }

}
