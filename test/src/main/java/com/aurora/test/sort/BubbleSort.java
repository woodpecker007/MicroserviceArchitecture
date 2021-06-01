package com.aurora.test.sort;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * 冒泡排序
 * 通过多次比较和交换来实现排序
 * 算法时间复杂度为O(n^2)
 */
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int tmp;
        for (int i=1; i<array.length; i++) {
            for (int j=0; j<array.length-i; j++) {
                if (array[j] > array[j+1]) {
                    tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
                System.out.println(JSON.toJSONString(array));
            }
            System.out.println(String.format("第%d轮执行结果：%s", i, JSON.toJSONString(array)));

        }

    }

    public static void main(String[] args) {
        int[] array = {100, 99, 12, 128, 256, 111};
        bubbleSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }
}
