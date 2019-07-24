package com.naruto.designpattern.factory.factorymethod;

/**
 * 工厂方法抽象层
 */
public abstract class AbstractHumanFactory {
    public abstract   <T extends Human> T createHuman(Class<T> clazz);

}
