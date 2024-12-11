package singleton;

/**
 * @Description: 单例模式-饿汉式一
 * @Author: cry
 * @CreateTime: 2024/12/10 16:08
 * @Version: 1.0
 */
public class SingletonEhanOne {
    private static SingletonEhanOne instance = new SingletonEhanOne();

    private SingletonEhanOne(){}

    public static SingletonEhanOne getInstance(){
        return instance;
    }
}
