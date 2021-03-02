package Creational.DependencyInjection.IoCContainer;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message Email: " + message);
    }
}
