package com.klodnicki.generics;

import java.util.List;

public class Test <N1 extends Number, N2 extends Number> {

    private N1 num1;
    private N2 num2;

    public Double addNumbers(N1 num1, N2 num2) {
        return (num1.intValue() + num2.doubleValue()) / 2;
    }

    public static void printList(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
        System.out.printf("number = %d", 8);
    }
}
