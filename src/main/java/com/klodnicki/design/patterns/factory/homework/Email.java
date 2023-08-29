package com.klodnicki.design.patterns.factory.homework;

public class Email implements Notification{
    @Override
    public void message() {
        System.out.println("You received this email because you are on newsletter list.");
    }
}
