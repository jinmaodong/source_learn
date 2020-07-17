package com.mdjin.part4.test;

import static com.mdjin.util.Print.*;

/**
 * 吸血鬼数字
 *
 * @author jinmaodong
 * @date 2020/5/23
 * @since 1.0.0
 **/
public class Demo10 {
    /**
     * main method
     */
    public static void main(String[] args) {

    }

    /**
     * 未完成，待编码
     * @param num
     * @return
     */
    static boolean 是否吸血鬼数字(int num) {
        if (num % 100 == 0) {
            return false;
        }
        int 个位 = num % 10;
        int 十位 = num % 100 - 个位;
        int 百位 = num % 1000 - 十位 * 10 - 个位;
        int 千位 = num % 10000 - 百位 * 100 - 十位 * 10 - 个位;
    //TODO 还没写完
        return false;

    }
}
