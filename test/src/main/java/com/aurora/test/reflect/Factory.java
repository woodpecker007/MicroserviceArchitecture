package com.aurora.test.reflect;

public class Factory {

    public static Fruit getInstance(String fruitName) {

        Fruit fruit = null;

        try {
            fruit = (Fruit) Class.forName(fruitName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fruit;
    }
}
