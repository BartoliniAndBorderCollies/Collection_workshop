package com.klodnicki.design.patterns.factory.homework;

//Zadanie 1. Fabryka
//        Wyobraź sobie, że pracujesz nad systemem powiadomień dla jakiejś aplikacji. W aplikacji są różne typy powiadomień:
//        smsowe oraz emailowe. Zaimplementuj system powiadomień za pomocą wzorca projektowego fabryka do tworzenia oraz
//        wysyłania powiadomień.

public class Main {

    public static void main(String[] args) {

        NotificationFactory smsFactory = new SmsFactory();
        NotificationFactory emailFactory = new EmailFactory();

        Notification sms = smsFactory.createNotification();
        sms.message();

        Notification email = emailFactory.createNotification();
        email.message();
    }
}
