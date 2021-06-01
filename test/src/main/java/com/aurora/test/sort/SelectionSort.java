package com.aurora.test.sort;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class SelectionSort {

    /**
     * 选择排序
     * 通过选择和比较实现排序
     * 时间复杂度为O(n^2)
     */

    public static void selectSort(int[] array) {
        int idx;
        int tmp;
        for(int i=0; i<array.length-1; i++) {

            idx = i;
            for (int j=i+1; j<array.length; j++) {
                if (array[j] < array[idx]) {
                    idx = j;
                }
            }

            if (idx != i) {
                tmp = array[i];
                array[i] = array[idx];
                array[idx] = tmp;
            }
            System.out.println(JSON.toJSONString(array));
        }
    }

    public static void main(String[] args) {
        int[] array = {100, 99, 12, 128, 256, 111};
        selectSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }
}
