package com.mdjin.part4.test;

import java.util.Random;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/22
 * @since 1.0.0
 **/
public class Demo2 {
    /**
     * main method
     */
    public static void main(String[] args) {
        final int key = 47;
        int local;
        for(int i = 0; i < 25; i++){
            local = getRandomInt();
            int next = getRandomInt();
            if(local > next){
                print(local + ">" + next);
            }else if(local == next){
                print(local + "=" + next);
            }else{
                print(local + "<" + next);
            }
        }

    }

    static int getRandomInt(int i){
        Random random = new Random(i);
        return random.nextInt();
    }
    static int getRandomInt(){
        Random random = new Random();
        return random.nextInt();
    }

}
