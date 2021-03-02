package Creational.DependencyInjection.IoCContainer;

import javax.management.InstanceNotFoundException;

public class Client {
    public static void main(String[] args) throws InstanceNotFoundException {
        // Còn hạn chế phải khởi tại SmsService hoặc EmailService.
        MessageService messageService = (MessageService) Injector.getInstance("messageService");
        UserController userController = new UserController(messageService);
        userController.send();
    }
}

/**
 * Dependency Injection Container hay còn gọi là Inversion of Control Container (IoC container).
 *
 * https://gpcoder.com/4975-huong-dan-java-design-pattern-dependency-injection/
 */
