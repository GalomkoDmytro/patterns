package abstractFactory.factory;

import abstractFactory.interfaces.DeviceFactory;
import abstractFactory.interfaces.Keyboard;
import abstractFactory.interfaces.Mouse;
import abstractFactory.interfaces.TouchPad;
import abstractFactory.ruImpl.RuKeyboard;
import abstractFactory.ruImpl.RuMouse;
import abstractFactory.ruImpl.RuTouchPad;

public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public TouchPad getTouchpad() {
        return new RuTouchPad();
    }
}
