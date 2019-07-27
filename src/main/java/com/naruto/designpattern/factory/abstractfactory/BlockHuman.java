package com.naruto.designpattern.factory.abstractfactory;

public abstract class BlockHuman implements Human {

    public void getColor() {
        System.out.println("黑人");
    }

    public void talk() {
        System.out.println("非洲话");
    }
}
