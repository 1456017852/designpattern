package com.naruto.designpattern.factory.simplefactory;

/**
 * 【简单工厂模式】
 * 一、基本介绍
 *  1) 简单工厂模式是属于创建型模式，是工厂模式的一种。
 *    简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 *    简单工厂模式是工厂模式家族中最简单实用的模式
 *  2) 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行为(代码)
 *  3) 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式
 *
 */
public class HumanFactory {

    public Human createHuman(String type){
        if("白人".equals(type)){
            return new WhiteHuman();
        }else if("黄种人".equals(type)){
            return new YellowHuman();
        }else if("黑人".equals(type)){
            return new BlockHuman();
        }
        return null;
    }

}
