package com.naruto.designpattern.adapter.interfaceAdapter;

/**
 * 接口适配器
 */
public abstract class Adapter implements Voltage220V {

    public int out22v() {
        return 0;
    }

    public int out44v() {
        return 0;
    }

    public int out72v() {
        return 0;
    }

    public int out96v() {
        return 0;
    }

    public abstract int out220v();
}
