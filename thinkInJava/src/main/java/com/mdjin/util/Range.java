package com.mdjin.util;

/**
 * @author jinmaodong
 * @date 2020/5/22
 * @since 1.0.0
 **/
public class Range {

    /**
     * 以i为起点，j为终点，步长为step，返回整型数组
     * @param i
     * @param j
     * @return
     */
    public static  int[] range(int i,int j,int step){
        int[] ints;
        if(j<=i){
            ints = new int[]{i};
        }else{
            ints = new int[(int)((j-i)/step+1)];
        }
        for(int c = 0;i < j;c++){
            ints[c] = i;
            i = i + step;
        }
        return ints;
    }

    /**
     * 以i为起点，j为终点，步长为1，返回整型数组
     * @param i
     * @param j
     * @return
     */
    public static  int[] range(int i,int j){
        return range(i,j,1);
    }

    /**
     * 以0为起点，i为终点，步长为1，返回整型数组
     * @param i
     * @return
     */
    public static  int[] range(int i){
        return range(0,i,1);
    }


}
