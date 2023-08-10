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


        //-----------------------------------------------------------------------------------------------------------------------
        //ARRAYLIST
        ArrayList<Integer> numbersArrList = new ArrayList<>();
        numbersArrList.add(1);
        System.out.println(numbersArrList.size());

        // Castowanie
        long smallNumber = 3_000_000_000L;
        int anotherNumber = (int) smallNumber;
        // min int = -2_147_483_646
        // max int = 2_147_483_647

        //----------------------------------------------------------------------------------------------------------------------
        //MAP

        // Map to interfejs, a HashMap, TreeMap, LinkedHashMap to konkretne implementacje
        // I tak samo dla List. List to interfejs, a ArrayList, LinkedList to konkretne implementacje.
        // Set to interfejs, a HashSet, TreeSet to konkretna implementacja

        Map<String, Double> menu = new HashMap<>();  //Map stosuje sie gdy potrzebujesz pary wartości.
        // Set jesli jest taki sam to nie wydrukuje się. Set i List jest bardzo podobny, Set sie preferuje, zeby nie bylo duplikatów.
        menu.put("Mojito", 20.0);
        menu.put(null, 18.0);
        menu.put("baaa", 20.0);
        menu.put("Sex on the Beach", 18.0);

        menu.putIfAbsent(null, 20.0);

        System.out.println(menu.containsKey("baaa"));
        System.out.println(menu.containsValue(100.0));

        System.out.println(menu.remove("Mojito"));
        System.out.println(menu.remove("Tego nie ma"));

        menu.putIfAbsent("Mojito", 10.0);

        System.out.println(menu);


    }
}

