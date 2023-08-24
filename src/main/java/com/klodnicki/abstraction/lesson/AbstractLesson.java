package com.klodnicki.abstraction.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbstractLesson {

    public static void main(String[] args) {
        Animal cat = new Cat("Kot", 2);
        Animal cow = new Cow("krowa", 14);

        List<Animal> animals = new ArrayList<>(Arrays.asList(cow, cat));
    }
}
