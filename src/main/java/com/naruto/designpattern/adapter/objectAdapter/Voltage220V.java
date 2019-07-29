package com.naruto.designpattern.adapter.objectAdapter;

/**
 * 被适配的类
 */
public class Voltage220V {

    public int out220V(){
        int src=220;
        System.out.println("输出220v的电压");
        return src;
    }

}
