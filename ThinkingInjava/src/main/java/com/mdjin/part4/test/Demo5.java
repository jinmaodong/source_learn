package com.mdjin.part4.test;

import static com.mdjin.util.Print.*;

/**
 * 使用位与运算符 和 无符号 左移运算符 输出数值的二进制
 * 关键在于：任何数 与 0x01进行位于操作，如果结果为0；则其最低位一定是0
 * @author jinmaodong
 * @date 2020/5/22
 * @since 1.0.0
 **/
public class Demo5 {
    /**
     * main method
     */
    public static void main(String[] args) {
        int i = 2;
//        i >>>=1;
//        print(Integer.toBinaryString(i));
//        print( i >> 1);
        print(toBinaryString(i));
        print(Integer.toBinaryString(i));
    }

    static String toBinaryString(int x){
        char[] chars = new char[32];
        for(int i = 31;i>=0;i--){
            if((x & 0x01) == 0){
                chars[i] = '0';
            }else{
                chars[i] = '1';
            }
            x >>>= 1;
        }
        StringBuffer bf = new StringBuffer();
        for(char c : chars){
            bf.append(c);
        }
        return bf.toString();
    }

}
