package com.mdjin.part4;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/23
 * @since 1.0.0
 **/
public class TestSwitch {
    /**
     * main method
     */
    public static void main(String[] args) {
        for(int i = 0; i<10;i++){
            {
                int j = 3;
                switch (j){
                    case 1:
                        print("case 1");
//                        break;
                    case 2:
                        print("case 2");
//                        break;
                    case 3:
                        print("case 3");
//                        break;
                    case 4:
                        print("case 4");
//                        break;
                    default:
                        print("default");
//                        break;
                }
            }
        }
    }

}
