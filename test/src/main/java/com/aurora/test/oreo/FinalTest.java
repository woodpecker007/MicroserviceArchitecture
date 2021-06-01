package com.aurora.test.oreo;

import lombok.Getter;

@Getter
public class FinalTest {

    /**
     * final修饰的变量
     * 1.声明时赋值
     * 2.通过构造函数赋值
     */
    private final String name;
    private int age;

    public FinalTest(String aa) {
        this.name = aa;
    }
}
