package com.naruto.designpattern.bridge;

public class VivoBrand implements Brand {

    public void open() {
        System.out.println("Vivo手机开机");
    }

    public void call() {
        System.out.println("Vivo手机打电话");
    }

    public void close() {
        System.out.println("Vivo手机关机");
    }

}
