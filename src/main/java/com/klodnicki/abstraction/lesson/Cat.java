package com.klodnicki.abstraction.lesson;

import com.klodnicki.abstraction.lesson.Animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau miau");
    }

    @Override
    public void walk() {
        System.out.println("Kot chodzi na czterech łapach");
    }
}
