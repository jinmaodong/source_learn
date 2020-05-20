package com.mdjin.eurekaclientfeign.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    enum ApiGroup{
        GROUP1("分组1-需明确分组名称"),
        GROUP2("分组2-需明确分组名称");

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private ApiGroup(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return this.getName();
        }
    }

    @Bean
    public Docket TestApi1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(ApiGroup.GROUP1.getName())
                .apiInfo(apiInfo())
                .pathMapping("/")
                // 选择那些路径和api会生成document
                .select()
                // 对所有api进行监控
                .apis(RequestHandlerSelectors.any())
                //不显示错误的接口地址
                //错误路径不监控
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                // 对根下所有路径进行监控
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    @Bean
    public Docket TestApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(ApiGroup.GROUP2.getName())
                .apiInfo(apiInfo())
                .pathMapping("/")
                // 选择那些路径和api会生成document
                .select()
                // 对所有api进行监控
                .apis(RequestHandlerSelectors.any())
                //不显示错误的接口地址
                //错误路径不监控
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                // 对根下所有路径进行监控
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("一体化平台接口服务")
                .contact(new Contact("金茂东", "", "jinmaodong@joyintech.com"))
                .description("一体化平台接口服务API")
//                .termsOfServiceUrl("NO terms of service")
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("v1.0")
                .build();
    }
}
