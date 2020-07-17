package com.mdjin.part7;

import static com.mdjin.util.Print.*;

/**
 * 代理得模式：持有一个对象得实例，然后暴露该对象得部分方法。
 *
 * @author jinmaodong
 * @date 2020/5/26
 * @since 1.0.0
 **/
public class SpaceShipDelegation {

    private String name;

    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name){
        this.name = name;
    }

    public void up(int velocity){
        controls.up(velocity);
    };
    public void down(int velocity){
        controls.down(velocity);
    };
    public void left(int velocity){
        controls.left(velocity);
    };
    public void right(int velocity){
        controls.right(velocity);
    };
    public void forward(int velocity){
        controls.forward(velocity);
    };
    public void back(int velocity){
        controls.back(velocity);
    };
    public void turboBoost(){
        controls.turboBoost();
    };


    /**
     * main method
     */
    public static void main(String[] args) {
        SpaceShipDelegation shipDelegation = new SpaceShipDelegation("NSEA Protector");
        shipDelegation.forward(100);
    }

}

class SpaceShipControls{
    void up(int velocity){};
    void down(int velocity){};
    void left(int velocity){};
    void right(int velocity){};
    void forward(int velocity){};
    void back(int velocity){};
    void turboBoost(){};
}
