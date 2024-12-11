package singleton;

/**
 * @Description: 单例模式-懒汉式一 线程不安全
 * @Author: cry
 * @CreateTime: 2024/12/10 16:16
 * @Version: 1.0
 */
public class SingletonLanHanOne {
    private SingletonLanHanOne instance = null;

    private SingletonLanHanOne(){}

    public SingletonLanHanOne getInstance(){
        if (instance==null){
            instance = new SingletonLanHanOne();
        }
         return instance;
    }
}
