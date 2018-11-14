package mediator.user;

import mediator.chat.Chat;

public class SimpleUser extends User {
    Chat chat;

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }


    public void getMessage(String message) {

        System.out.println("User : '" + getName() + "' " + message + "' ");
    }


}
