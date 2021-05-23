package com.aurora.test.reflect;

public class Test {

    public static void main(String[] args) {
        Fruit fruit = Factory.getInstance("com.aurora.test.reflect.Apple");
        System.out.println("=============================");
        fruit.eat();
    }
}
