package org.example;

import org.example.factorymethod.EmailNotificationFactory;
import org.example.factorymethod.NotificationService;
import org.example.factorymethod.PushNotificationFactory;
import org.example.factorymethod.SMSNotificationFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        String msg = "Bem-vindo ao sistema!";

        NotificationService emailService = new NotificationService(new EmailNotificationFactory());
        emailService.notifyUser(msg);

        NotificationService smsService = new NotificationService(new SMSNotificationFactory());
        smsService.notifyUser(msg);

        NotificationService pushService = new NotificationService(new PushNotificationFactory());
        pushService.notifyUser(msg);
    }
}