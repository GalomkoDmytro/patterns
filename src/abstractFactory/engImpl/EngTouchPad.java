package abstractFactory.engImpl;

import abstractFactory.interfaces.TouchPad;

public class EngTouchPad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("eng touch pad " + deltaX + " " + deltaY);
    }
}
