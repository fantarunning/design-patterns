package singleton;

/**
 * @Description: 单例模式-饿汉式二
 * @Author: cry
 * @CreateTime: 2024/12/10 16:11
 * @Version: 1.0
 */
public class SingletonEhanTwo {
    private static SingletonEhanTwo instance = null;

    static {
        instance = new SingletonEhanTwo();
    }

    private SingletonEhanTwo(){}

    public static SingletonEhanTwo getInstance() {
        return instance;
    }
}
