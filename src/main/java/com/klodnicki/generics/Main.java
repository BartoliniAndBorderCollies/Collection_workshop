package com.klodnicki.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericClazz<Float> ourGeneric1 = new GenericClazz<>(5, "Tu bedzie String", 1.2f);
        GenericClazz<Double> ourGeneric2 = new GenericClazz<>(5, "a tutaj Double", 2.5);
        GenericClazz<Integer> ourGeneric3 = new GenericClazz<>(5, "a tutaj Integer", 3);

//        String string = ourGeneric1.getNumber();
        Double aDouble = ourGeneric2.getNumber();
//        Object object = ourGeneric3.getNumber();

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(12);

        Test.printList(list);
    }

    public <X, Y extends Number> List<X> myFirstGenericMethod(X object1, Y object2) {
        System.out.println(object2.byteValue());
        return Arrays.asList(object1, object1);
    }

    public <T> void secondGenericMethod(T object) {

    }


    // generyczność:
    // boilerplate code - powtarzający się kod w różnych miejscach - generyczność pozwala z tym walczyć
    // klasa generyczna
    // rozszerzenia generyczne - zawężenie generyczności (extends)
    // metody generyczne
    // wildcards
}


