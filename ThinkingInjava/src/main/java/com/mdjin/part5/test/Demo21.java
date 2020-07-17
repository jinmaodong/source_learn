package com.mdjin.part5.test;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class Demo21 {
    /**
     * main method
     */
    public static void main(String[] args) {
        for(Money money : Money.values()){
            print(money.ordinal()+":"+money.name()+":"+getDesc(money));
        }
    }

    public static String getDesc(Money money){
        switch (money){
            case 一元:
                return "这是一元";
            case 五元:
                return "这是五元";
            case 十元:
                return "这是十元";
            case 二十元:
                return "这是二十元";
            case 五十元:
                return "这是五十元";
            case 百元:
                return "这是一百元";
            default:
                return "UNKNOWN";
        }
    }

}

enum Money{
    百元,五十元,二十元,十元,五元,一元
}
