package com.klodnicki.abstraction.homework;

public class Giraffe extends Creature implements Herbivore{
    @Override
    public void makePoop() {
        System.out.println("Green poop with leafs");
    }

    @Override
    public void defend() {
        System.out.println("It's difficult to defend with such a long neck!");
    }

    @Override
    public void escape() {
        System.out.println("Because my legs are long I can run very fast!");
    }
}
