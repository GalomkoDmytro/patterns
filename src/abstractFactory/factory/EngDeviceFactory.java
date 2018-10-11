package abstractFactory.factory;

import abstractFactory.engImpl.EngKeyboard;
import abstractFactory.engImpl.EngMouse;
import abstractFactory.engImpl.EngTouchPad;
import abstractFactory.interfaces.DeviceFactory;
import abstractFactory.interfaces.Keyboard;
import abstractFactory.interfaces.Mouse;
import abstractFactory.interfaces.TouchPad;

public class EngDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new EngMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EngKeyboard();
    }

    @Override
    public TouchPad getTouchpad() {
        return new EngTouchPad();
    }
}
