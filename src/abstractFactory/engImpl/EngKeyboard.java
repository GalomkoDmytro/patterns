package abstractFactory.engImpl;

import abstractFactory.interfaces.Keyboard;

public class EngKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("ru print");
    }

    @Override
    public void println() {
        System.out.println("ru println");
    }
}
