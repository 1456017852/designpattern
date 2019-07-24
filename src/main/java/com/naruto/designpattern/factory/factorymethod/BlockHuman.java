package com.naruto.designpattern.factory.factorymethod;

public class BlockHuman implements Human {
    public void getColor() {
        System.out.println("黑色人种");
    }

    public void talk() {
        System.out.println("黑人讲话");
    }
}
