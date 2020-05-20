package com.mdjin.part3;
import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
public class PassObject {
    public static void main(String[] args){
        Letter letter = new Letter();
        letter.x = 999f;
        print(letter.x);
        changeValue(letter);
        print(letter.x);
    }

    static void changeValue(Letter x){
        x.x = 99f;
    }

}

class Letter{
    float x = 0f;
}
