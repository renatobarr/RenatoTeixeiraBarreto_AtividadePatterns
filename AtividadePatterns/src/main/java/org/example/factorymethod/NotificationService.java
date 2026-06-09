package org.example.factorymethod;

public class NotificationService {
    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void notifyUser(String message) {
        // O serviço não usa "new", ele apenas pede para a factory criar
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}