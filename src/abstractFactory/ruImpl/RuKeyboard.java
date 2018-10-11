package abstractFactory.ruImpl;

import abstractFactory.interfaces.Keyboard;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("ru print");
    }

    @Override
    public void println() {
        System.out.println("ru println");
    }
}
