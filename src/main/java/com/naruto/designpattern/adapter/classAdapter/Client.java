package com.naruto.designpattern.adapter.classAdapter;

import org.junit.Test;

public class Client {

    @Test
    public void test(){
       Phone p= new Phone();
       p.charging(new Adapter());
    }

}
