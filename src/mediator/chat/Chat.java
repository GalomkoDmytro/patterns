package mediator.chat;

import mediator.user.User;

public interface Chat {
    void sendMessage(String message, User user);
}
