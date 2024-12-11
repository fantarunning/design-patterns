package singleton;

/**
 * @Description: 单例模式-内部类方式实现 推荐使用
 * @Author: cry
 * @CreateTime: 2024/12/10 17:18
 * @Version: 1.0
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

    //调用方式
    //Singleton instance = Singleton.getInstance();
}
