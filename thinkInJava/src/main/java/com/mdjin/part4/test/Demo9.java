package com.mdjin.part4.test;

import static com.mdjin.util.Print.*;

/**
 * 斐波那契数列
 * @author jinmaodong
 * @date 2020/5/23
 * @since 1.0.0
 **/
public class Demo9 {
    /**
     * main method
     */
    public static void main(String[] args) {
        int[] nums = getNums(10);
        for(int i : nums){
            print(i);
        }

    }

    static int[] getNums(int count){
        if(count == 1){
            return new int[]{1};
        }else if(count == 2){
            return new int[]{1,1};
        }else{
            int[] result = new int[count];
            int i = 1,j=1;
            result[0] = 1;
            result[1] = 1;
            //****k++是在循坏一次之后再+1的，注意
            for(int k = 2; k < count; k++){
                result[k] = i + j;
                i = j;
                j = result[k];
            }
            return result;
        }
    }

}
