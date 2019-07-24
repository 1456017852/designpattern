package com.naruto.designpattern.singleton.lazy;

/**
 * 【单例模式:懒汉式(线程安全，同步方法)】
 * 1) 解决了线程不安全问题
 * 2) 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 *      而其实这个方法只执行一次实例化代码就够了,后面的想获得该类实例,直接return就行了。
 *      方法进行同步效率太低
 * 3) 结论：在实际开发中，不推荐使用这种方
 *
 *
 */
public class SingletonLazySync {

    private SingletonLazySync(){}

    private static SingletonLazySync instance;

    public static synchronized SingletonLazySync  getInstance(){
        if(null==instance){
            instance=new SingletonLazySync();
        }
        return instance;
    }
}
