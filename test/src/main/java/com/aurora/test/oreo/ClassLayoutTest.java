package com.aurora.test.oreo;

import org.openjdk.jol.info.ClassLayout;

public class ClassLayoutTest {


    public static void main(String[] args) {
        Object obj = new Object();

//        int hash = obj.hashCode();
//        System.out.println(hash);
        obj.hashCode();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        StringBuilder stringBuilder = new StringBuilder();
        synchronized (obj) {
            obj.hashCode();
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }

    }
}
