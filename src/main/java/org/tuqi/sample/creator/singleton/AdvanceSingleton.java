package org.tuqi.sample.creator.singleton;

/**
 * IoDH(Initialization On Demand Holder)实现单例模式
 *
 * 优点: 组合饿汉式与懒汉式的优点
 * 缺点: 跟语言特性强相关,Java依赖JVM
 *
 *  静态内部类只有在调用时才会加载，加载时首先会判断外部类是否加载，如果外部类没有加载，首先加载外部类
 *
 */
public class AdvanceSingleton {

    private AdvanceSingleton(){}

    private static class HolderClass {
        private final static AdvanceSingleton instance = new AdvanceSingleton();
    }

    public static AdvanceSingleton getInstance() {
        return HolderClass.instance;
    }

}
