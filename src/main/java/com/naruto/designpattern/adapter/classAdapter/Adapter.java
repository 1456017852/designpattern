package com.naruto.designpattern.adapter.classAdapter;

/**
 * 类适配器
 */
public class Adapter extends Voltage220V implements Voltage5V  {

    public int out5V() {
        //降压处理
        int src=out220V()/44;
        System.out.println("适配处理(降压),电压为："+src+"v");
        return src;
    }

}
