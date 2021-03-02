package Creational.DependencyInjection.IoCContainer;

public class SmsService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message SMS: " + message);
    }
}
