package com.klodnicki.design.patterns.factory.homework;

public class Sms implements Notification{
    @Override
    public void message() {
        System.out.println("You have received this sms because you are on the notification list.");
    }
}
