package mediator.user;

import mediator.chat.Chat;

public class Admin extends User {

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    public void getMessage(String message) {

        System.out.println("Admin : '" + getName() + "' " + message + "' ");
    }

}
