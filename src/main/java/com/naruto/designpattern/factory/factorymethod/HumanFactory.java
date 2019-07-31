package com.naruto.designpattern.factory.factorymethod;

/**
 * 【工厂方法模式】
 * 定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。
 */
public class HumanFactory extends AbstractHumanFactory {

    public  <T extends Human> T createHuman(Class<T> clazz) {
        Human human=null;
        try{
            human=(Human) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)human;
    }
}
