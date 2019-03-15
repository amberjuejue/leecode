package com.wyj.leecode.singleton;

/**
 * 双重检索-单例模式
 *
 * @author wangyujue
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    public DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

    private DoubleCheckSingleton() {
    }
}
