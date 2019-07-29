package com.naruto.designpattern.adapter.objectAdapter;

public class Phone {

    public void charging(Voltage5V voltage5V){
        if(voltage5V.out5V()==5){
            System.out.println("电压为5v,可以充电...");
        }else if(voltage5V.out5V()>5){
            System.out.println("电压超过5v,不可以充电...");
        }
    }

}
