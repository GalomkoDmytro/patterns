package abstractFactory;

import java.security.Key;

public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchpad();
}
