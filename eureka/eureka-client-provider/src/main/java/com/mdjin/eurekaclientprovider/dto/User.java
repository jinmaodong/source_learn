package com.mdjin.eurekaclientprovider.dto;

/**
 * dto：用户
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
public class User {

    private String id;

    private String name;

    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
