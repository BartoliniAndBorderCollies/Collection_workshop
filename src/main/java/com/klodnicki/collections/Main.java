package com.klodnicki.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Collections
        // Array
        // List (interface) -> ArrayList, LinkedList konkretne implementacje
        // Set (interface) -> HashSet, LinkedHashSet, TreeSet konkretne implementacje - gdy nie chcesz duplikatów
        // Map (interface) -> HashMap, LinkedHashMap, TreeMap konkretne implementacje - gdy potrzebujesz pary wartości


        //--------------------------------------------------------------------------------------------------------------
        //ARRAY

        // 1 sposób
        int[] numbers1 = {1, 2, 4};

        // 2 sposób
        int[] numbers2;
        numbers2 = new int[]{24, 34, 55};

        numbers2[0] = 42;

        // 3 sposób
        int[] numbers3 = new int[3];

        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;

        System.out.println(Arrays.toString(numbers3));

        int[] temp = new int[4];
        for (int i = 0; i < numbers3.length; i++) {
            temp[i] = numbers3[i];
        }
        temp[3] = 4;

        numbers3 = temp;

        System.out.println(Arrays.toString(numbers3));


    }
}
