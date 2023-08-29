package com.klodnicki.design.patterns.factory.homework;

public class EmailFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new Email();
    }
}
