package com.klodnicki.abstraction.homework;

public class Human extends Creature implements Predator, Herbivore{
    @Override
    public void makePoop() {
        System.out.println("We take shit like kings on the throne!");
    }
    @Override
    public void defend() {
        System.out.println("Not only we use physical force but mostly we use tools!");
    }
    @Override
    public void track() {
        System.out.println("Lets use some dogs to track these beasts!");
    }
    @Override
    public void hunt() {
        System.out.println("Oh it is so exiting to use all technology and kill the beast far from the distance!");
    }
    @Override
    public void kill() {
        System.out.println("We kill for sport!");
    }
    @Override
    public void escape() {
        System.out.println("Oh it is so sad when I am out of bullets and must run away!");
    }
}
