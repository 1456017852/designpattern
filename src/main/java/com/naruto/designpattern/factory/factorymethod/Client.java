package com.naruto.designpattern.factory.factorymethod;

import org.junit.Test;

/**
 * 测试类
 */
public class Client {

    @Test
    public void test(){
        HumanFactory humanFactory=new HumanFactory();
        Human blockHuman= humanFactory.createHuman(BlockHuman.class);
        blockHuman.getColor();
        blockHuman.talk();
        Human yellowHuman= humanFactory.createHuman(YellowHuman.class);
        yellowHuman.talk();
        yellowHuman.getColor();
        Human whiteHuman= humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
