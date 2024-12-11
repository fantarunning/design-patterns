package singleton;

/**
 * @Description: 单例模式-懒汉式二加锁 效率很低
 * @Author: cry
 * @CreateTime: 2024/12/10 16:16
 * @Version: 1.0
 */
public class SingletonLanHanTwo {
    private SingletonLanHanTwo instance = null;

    private SingletonLanHanTwo(){}

    public synchronized SingletonLanHanTwo getInstance(){
        if (instance==null){
            instance = new SingletonLanHanTwo();
        }
         return instance;
    }
}
