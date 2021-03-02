package Creational.DependencyInjection.IoCContainer;

public class UserController {
    private MessageService messageService;

    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send() {
        messageService.sendMessage("Hello Dependency injection pattern");
    }
}
