package com.aurora.test.singleton;

public class VolatileSingleton {

    private static volatile VolatileSingleton volatileSingleton = null;

    private VolatileSingleton() {

    }

    public static VolatileSingleton getInstance() {
        if (volatileSingleton == null) {
            synchronized (VolatileSingleton.class) {
                if (volatileSingleton == null) {
                    volatileSingleton = new VolatileSingleton();
                }
            }
        }

        return volatileSingleton;
    }

    public static void main(String[] args) {
        VolatileSingleton singleton1 = VolatileSingleton.getInstance();
        VolatileSingleton singleton2 = VolatileSingleton.getInstance();
        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
