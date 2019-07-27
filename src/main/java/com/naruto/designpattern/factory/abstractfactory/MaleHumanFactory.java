package com.naruto.designpattern.factory.abstractfactory;

public class MaleHumanFactory implements HumanFactory {


    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createBlockHuman() {
        return null;
    }

    public Human createWhiteHuman() {
        return null;
    }
}
