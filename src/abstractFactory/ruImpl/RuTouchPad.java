package abstractFactory.ruImpl;

import abstractFactory.interfaces.TouchPad;

public class RuTouchPad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("ru touch pad " + deltaX + " " + deltaY);
    }
}
