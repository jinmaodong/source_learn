package com.mdjin.part7;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class SprinklerSystem {

    private String s;

    /**
     * main method
     */
    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        print(sprinklerSystem.toString());
    }

    @Override
    public String toString(){
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //super.toString();
        if(null == s){
            s = "delayed initialization";
        }
        return s;
    }
}

