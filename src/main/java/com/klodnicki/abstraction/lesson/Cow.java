package com.klodnicki.abstraction.lesson;

public class Cow extends Animal implements Milkable {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Muuuuuuu");
    }

    @Override
    public void walk() {
        System.out.println("Krowa chodzi na 4 nogach");
    }

    @Override
    public void milk() {
        System.out.println("Krowa została wydojona");
    }
}
