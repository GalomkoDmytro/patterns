package abstractFactory.engImpl;

import abstractFactory.interfaces.Mouse;

public class EngMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("eng onclick");
    }

    @Override
    public void dbClick() {
        System.out.println("eng db click");
    }

    @Override
    public void scrolle(int dir) {
        System.out.println("scroll eng dir " + dir);
    }
}
