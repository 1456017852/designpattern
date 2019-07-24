package com.naruto.designpattern.factory.simplefactory;

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
