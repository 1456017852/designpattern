package Test;

import com.naruto.designpattern.singleton.hungry.staticfinal.Singleton;
import org.junit.Test;

/**
 * 单例模式测试类
 */
public class SingletonTest {

    /**
     * 懒汉式(静态常量)
     */
    @Test
    public void testStaticFinalSingleton(){
        Singleton staticFinalSingleton1= Singleton.getInstance();
        Singleton staticFinalSingleton2= Singleton.getInstance();
        System.out.println(staticFinalSingleton1==staticFinalSingleton2);
        System.out.println(staticFinalSingleton1.equals(staticFinalSingleton2));
        System.out.println("staticFinalSingleton1.hashCode:"+staticFinalSingleton1.hashCode());
        System.out.println("staticFinalSingleton2.hashCode:"+staticFinalSingleton2.hashCode());
    }


}
