package mediator.user;

import mediator.chat.Chat;

public abstract class User {

    Chat chat;
    String name;
    boolean isEnable = true;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    public abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
