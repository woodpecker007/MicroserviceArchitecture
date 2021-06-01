package com.aurora.test.oreo;


public class ThreadLocalTest {

    private static ThreadLocal<Integer> tl = new ThreadLocal<>();

    public static void add(int num) {
        tl.set(num);
    }

}
