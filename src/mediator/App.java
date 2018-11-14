package mediator;

import mediator.chat.TextChat;
import mediator.user.Admin;
import mediator.user.SimpleUser;
import mediator.user.User;

// посредник
public class App {

    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Adminushca");
        User u1 = new SimpleUser(chat, "Vasa");
        User u2 = new SimpleUser(chat, "Smitt");
        User u3 = new SimpleUser(chat, "Vova");
        u3.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        u1.sendMessage("Hello I am user!");
    }
}
