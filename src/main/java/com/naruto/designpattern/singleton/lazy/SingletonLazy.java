package com.naruto.designpattern.singleton.lazy;

/**
 * 【单例模式：懒汉式(线程不安全)】
 *
 *  1) 起到了Lazy Loading的效果，但是只能在单线程下使用。
 *  2) 如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及 往下执行，
 *      另一个线程也通过了这个判断语句，这时便会产生多个实例。所以 在多线程环境下不可使用这种方式
 *  *  3) 结论：在实际开发中，不要使用这种方式
 *
 *
 *
 */
public class SingletonLazy {

    //1、构造器私有化
    private SingletonLazy(){}

    //2、静态实例对象
    private static SingletonLazy instance;

    //3、公共的静态方法返回实例对象,当使用该方法时才去创建对象
    public static SingletonLazy  getInstance(){
        if(null==instance){
            instance=new SingletonLazy();
        }
        return instance;
    }
}
