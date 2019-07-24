package com.naruto.designpattern.factory.factorymethod;

public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色人种");
    }

    public void talk() {
        System.out.println("白人讲话");
    }
}
