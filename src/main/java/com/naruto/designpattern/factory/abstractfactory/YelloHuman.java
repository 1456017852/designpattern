package com.naruto.designpattern.factory.abstractfactory;

public abstract class YelloHuman implements Human{


    public void getColor() {
        System.out.println("黄种人");
    }

    public void talk() {
        System.out.println("汉语");
    }
}
