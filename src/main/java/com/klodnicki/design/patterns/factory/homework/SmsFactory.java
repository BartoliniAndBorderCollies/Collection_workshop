package com.klodnicki.design.patterns.factory.homework;

public class SmsFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new Sms();
    }
}
