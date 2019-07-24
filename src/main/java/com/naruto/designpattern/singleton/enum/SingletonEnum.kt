package com.naruto.designpattern.singleton.enum

/**
 * 【单例模式：枚举】
 * 1) 这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 2) 这种方式是Effective Java作者Josh Bloch 提倡的方式
 * 3) 结论：推荐使用
 */
enum class SingletonEnum {
    INSTANCE;
}

