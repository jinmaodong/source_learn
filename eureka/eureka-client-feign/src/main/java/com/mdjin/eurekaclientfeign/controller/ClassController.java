package com.mdjin.eurekaclientfeign.controller;

import com.mdjin.eurekaclientfeign.feign.ClassesFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
@RestController
public class ClassController {

    @Autowired
    private ClassesFeign classesFeign;

    @RequestMapping("/sayHello.co")
    public String sayHello(@RequestParam("name") String name){
        return classesFeign.sayHello(name);
    }
}
