package com.naruto.designpattern.factory.simplefactory;

public class BlockHuman implements Human {
    public void getColor() {
        System.out.println("黑色人种");
    }

    public void talk() {
        System.out.println("黑人讲话");
    }
}
