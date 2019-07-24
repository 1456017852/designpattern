package com.naruto.designpattern.factory.simplefactory;

import org.junit.Test;

/**
 * 1) 简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式是由一 个工厂对象决定创建出哪一种产品类的实例。
 *  简单工厂模式是工厂模式家族 中最简单实用的模式
 * 2) 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行 为(代码)
 * 3) 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会 使用到工厂模式
 */

public class client {

    @Test
    public void test(){
        HumanFactory humanFactory=new HumanFactory();
        Human whiteHuman=humanFactory.createHuman("白人");
        whiteHuman.getColor();
        whiteHuman.talk();
        Human yellowHuman=humanFactory.createHuman("黄种人");
        yellowHuman.getColor();
        yellowHuman.talk();
        Human blockHuman=humanFactory.createHuman("黑人");
        blockHuman.getColor();
        blockHuman.talk();

    }
}
