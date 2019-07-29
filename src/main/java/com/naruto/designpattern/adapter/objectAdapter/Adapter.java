package com.naruto.designpattern.adapter.objectAdapter;

import org.junit.Assert;

/**
 * 类适配器
 */
public class Adapter implements Voltage5V{

    private Voltage220V voltage220V; //聚合关系

    public Adapter(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }

    public int out5V() {

        if(null==voltage220V){
            return 0;
        }

        //降压处理
        int src=voltage220V.out220V()/44;
        System.out.println("适配处理(降压),电压为："+src+"v");
        return src;
    }

}
