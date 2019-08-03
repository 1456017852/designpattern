package com.naruto.designpattern.bridge;

public class XiaoMiBrand implements Brand {

    public void open() {
        System.out.println("小米手机开机");
    }

    public void call() {
        System.out.println("小米手机打电话");
    }

    public void close() {
        System.out.println("小米手机关机");
    }
}
