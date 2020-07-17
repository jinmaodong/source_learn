package com.mdjin.part6;

import com.mdjin.part6.dessert.Cookie;

import java.util.Arrays;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class ChocolateChip extends Cookie {
    /**
     * main method
     */
    public static void main(String[] args) {
        ChocolateChip chocolateChip = new ChocolateChip();
        chocolateChip.chomp();
        Class<ChocolateChip> chocolateChipClass = ChocolateChip.class;
        print(Arrays.toString(chocolateChipClass.getDeclaredMethods()));
    }

    public ChocolateChip(){
        print("ChocolateChip constructor");
    }

    public void chomp(){
        //默认权限方法不能被子类调用
//        bite();
    }
}
