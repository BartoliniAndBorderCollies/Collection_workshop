package com.klodnicki.design.patterns.strategy.homework;

import java.util.Arrays;

public class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
