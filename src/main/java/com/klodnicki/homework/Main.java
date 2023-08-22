package com.klodnicki.homework;

public class Main {

    public static void main(String[] args) {

        Collection<Object> collection = new Collection<>();

        String name = "Bordi";
        int number = 7;

        collection.add(name);
        collection.add(number);
        collection.add(0);

        System.out.println(collection.get(0));

        System.out.println(collection);

        collection.remove(0);
        System.out.println(collection);

        collection.add(name);
        collection.add(name);
        System.out.println(collection);

        collection.remove(name);
        System.out.println(collection);

        System.out.println(collection.size());

        System.out.println(collection.isEmpty());


    }


}
