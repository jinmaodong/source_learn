package com.mdjin.part4.test;

import static com.mdjin.util.Print.*;

/**
 * 打印素数
 * @author jinmaodong
 * @date 2020/5/22
 * @since 1.0.0
 **/
public class Demo4 {
    /**
     * main method
     */
    public static void main(String[] args) {
        int count = 0;
        int start = 0;
        int end = 100000;
//        int end = Integer.MAX_VALUE;
        boolean is素数 = false;
        for(int i = start; i < end;i++){
            is素数 = 是否素数(i);
            count += is素数 ? 1 : 0;
        }
        print("从 "+start+" 到 "+end+" 之间素数的数量为："+count);
    }

    public static boolean  是否素数(int x){
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }
//        print(x+" 是素数.");
        return true;
    }
}
