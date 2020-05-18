//:part3/HelloDate.java
package com.mdjin.part3;

import java.util.Date;

//注意静态导入，JDK1.5引入的
import static com.mdjin.util.Print.*;
/**
 * @author jinmaodong
 * @date 2020/5/19
 * @since 1.0.0
 **/
public class HelloDate {

    public static void main(String[] args){
        print("Hello, it's :");
        print(new Date());
    }
}
/*
 Output:
 Hello, it's :
 Tue May 19 00:56:36 CST 2020

 */
