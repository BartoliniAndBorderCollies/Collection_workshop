package com.klodnicki.abstraction.homework;

public class Lion extends Creature implements Predator{
    @Override
    public void makePoop() {
        System.out.println("Poop like a cat!");
    }
    @Override
    public void defend() {
        System.out.println("I can defend very effective!");
    }
    @Override
    public void track() {
        System.out.println("Sniff sniff and I got you!");
    }
    @Override
    public void hunt() {
        System.out.println("Chasing and hunting is so exciting!");
    }
    @Override
    public void kill() {
        System.out.println("Mhmmmm fresh meat is what I love!");
    }
}
