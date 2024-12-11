package singleton;

/**
 * @Description: 单例模式-枚举类 推荐使用
 * @Author: cry
 * @CreateTime: 2024/12/10 16:33
 * @Version: 1.0
 */
/*
 * 由于创建枚举实例的过程是线程安全的，所以这种写法没有同步的问题
 *
 * 这种写法在功能上与共有域方法相近，但是它更简洁，无偿地提供了序列化机制，绝对防止对此实例化，即使是在面对复杂的序列化或者反射攻击的时候。
 * 虽然这中方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
 */

public enum SingletonEnum {
    instance;

    private SingletonEnum(){}

    public void method(){}


    //访问方式
    //SingletonEnum.instance.method();
}
