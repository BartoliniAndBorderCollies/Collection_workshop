package com.klodnicki.abstraction.lesson;

public abstract class Animal implements Walkable, Speakable {
    private String name;
    private int age;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}