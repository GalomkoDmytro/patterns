package abstractFactory.engImpl;

import abstractFactory.interfaces.Mouse;

public class EngMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("ru onclick");
    }

    @Override
    public void dbClick() {
        System.out.println("ru db click");
    }

    @Override
    public void scrolle(int dir) {
        System.out.println("scroll dir " + dir);
    }
}
