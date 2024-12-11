package singleton;

/**
 * @Description: 单例模式-懒汉式三加锁 线程仍然不安全
 * @Author: cry
 * @CreateTime: 2024/12/10 16:16
 * @Version: 1.0
 */
public class SingletonLanHanThree {
    private SingletonLanHanThree instance = null;

    private SingletonLanHanThree(){}

    public SingletonLanHanThree getInstance(){
        if (instance==null){
            synchronized (SingletonLanHanThree.class){
                instance = new SingletonLanHanThree();
            }
        }
         return instance;
    }
}
