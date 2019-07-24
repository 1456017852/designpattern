package com.naruto.designpattern.factory.factorymethod;

/**
 * 工厂方法类
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
