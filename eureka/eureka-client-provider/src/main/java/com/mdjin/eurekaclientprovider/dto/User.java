package com.mdjin.eurekaclientprovider.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * dto：用户
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
@Getter
@Setter
@ApiModel(value = "用户信息接口-接口传输类",description = "参数-user")
public class User {

    /**
     * id
     */
    @ApiModelProperty(name = "用户ID",value = "32位字符串，符合驼峰规则")
    private String id;

    /**
     * name
     */
    @ApiModelProperty(value = "用户名称")
    private String name;

    /**
     * age
     */
    @ApiModelProperty(value = "年龄",required = true)
    private int age;


}
