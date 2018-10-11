package abstractFactory.engImpl;

import abstractFactory.interfaces.Keyboard;

public class EngKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("eng print");
    }

    @Override
    public void println() {
        System.out.println("eng println");
    }
}
