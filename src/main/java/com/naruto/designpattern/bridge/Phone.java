package com.naruto.designpattern.bridge;


/**
 * 桥接类
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand){
        this.brand=brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }



}
