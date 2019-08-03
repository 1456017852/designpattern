package com.naruto.designpattern.bridge;

import org.junit.Test;

public class Client{

    @Test
    public void test(){

        Phone upRightPhone=new UpRightPhone(new XiaoMiBrand()) ;
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();

        System.out.println("--------------------------------------------------");

        Phone foldedPhone =new FoldedPhone(new VivoBrand());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();


    }
}
