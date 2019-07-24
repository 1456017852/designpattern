package com.naruto.designpattern.singleton.hungry.staticmodel;

/**
 * 【单例模式:饿汉式(静态代码块)】
 *
 *  1) 这种方式和懒汉式(静态常量)的方式其实类似，只不过将类实例化的过程放在了静态代码块中，
 *      也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 *  2) 结论：这种单例模式可用，但是可能造成内存浪
 *
 */
public class Singleton {

    private static Singleton instance;

    //1、构造器私有化
    private Singleton(){}

    //2、静态代码块
    static{
        instance=new Singleton();
    }

    //3、公共的静态方法返回实例对象
    public static Singleton getInstance(){
        return instance;
    }



}
