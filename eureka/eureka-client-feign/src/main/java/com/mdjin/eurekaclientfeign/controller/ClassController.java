package com.mdjin.eurekaclientfeign.controller;

import com.mdjin.eurekaclientfeign.dto.TsUser;
import com.mdjin.eurekaclientfeign.feign.ClassesFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
@RestController
@Api(tags = "sayHello服务接口")
public class ClassController {

    @Autowired
    private ClassesFeign classesFeign;


    @ApiOperation(value = "sayHello对用户说你好啊!",notes = "sayHello对用户说你好啊，显示用户信息.")
    @RequestMapping(value = "/sayHello.co" ,method = RequestMethod.POST)
    public String sayHello(@RequestBody TsUser user){
        return classesFeign.sayHello(user);
    }
}
