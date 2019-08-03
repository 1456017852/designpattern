package com.naruto.designpattern.bridge;

public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.println("中立式");
        super.open();
    }

    @Override
    protected void close() {
        System.out.println("中立式");
        super.close();
    }

    @Override
    protected void call() {
        System.out.println("中立式");
        super.call();
    }
}
