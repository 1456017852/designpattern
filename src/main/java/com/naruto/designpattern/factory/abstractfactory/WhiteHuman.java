package com.naruto.designpattern.factory.abstractfactory;

public abstract class WhiteHuman implements Human {

    public void getColor() {
        System.out.println("白人");
    }

    public void talk() {
        System.out.println("英语");
    }
}
