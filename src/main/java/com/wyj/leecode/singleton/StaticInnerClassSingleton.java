package com.wyj.leecode.singleton;

/**
 * 单例模式-静态内部类
 * @author wangyujue
 */
public class StaticInnerClassSingleton {
    private static class MySingletonHandle {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return MySingletonHandle.instance;
    }
}
