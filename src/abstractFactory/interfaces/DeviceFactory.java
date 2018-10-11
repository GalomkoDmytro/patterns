package abstractFactory.interfaces;

public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchpad();
}
