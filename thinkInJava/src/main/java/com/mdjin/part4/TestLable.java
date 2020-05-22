package com.mdjin.part4;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/22
 * @since 1.0.0
 **/
public class TestLable {
    /**
     * main method
     */
    public static void main(String[] args) {
        int i = 0;
        outer:
        for(;true;){
            inner:
            for(;i<10;i++){
                print("i = "+i);
                if(i == 2){
                    print("continue");
                    continue ;
                }
                if(i == 3){
                    print("break");
                    i++;
                    break ;
                }
                if(i == 7){
                    print("continue outer");
                    i++;
                    continue outer;
                }
                if(i == 8){
                    print("break outer");
                    break outer;
                }
                for(int k = 0; k < 5; k++){
                    if(k == 3){
                        print("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }

}
