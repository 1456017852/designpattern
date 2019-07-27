package com.naruto.designpattern.factory.abstractfactory;

public class FemaleHumanFactory implements HumanFactory {

    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createBlockHuman() {
        return null;
    }

    public Human createWhiteHuman() {
        return null;
    }
}
