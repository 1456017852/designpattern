package com.naruto.designpattern.factory.simplefactory;

public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄种人");
    }

    public void talk() {
        System.out.println("黄种人讲话");
    }
}
