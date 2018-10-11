package abstractFactory;

import abstractFactory.factory.EngDeviceFactory;
import abstractFactory.factory.RuDeviceFactory;
import abstractFactory.interfaces.DeviceFactory;
import abstractFactory.interfaces.Mouse;

public class App {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = getFactoryByCountyCode("RU");
        
        Mouse mouse = deviceFactory.getMouse();
        mouse.click();
    }

    private static DeviceFactory getFactoryByCountyCode(String lang) {
        switch (lang) {
            case "RU":
                return new RuDeviceFactory();

            case "ENG":
                return new EngDeviceFactory();

            default:
                throw  new RuntimeException("Unsupported code " + lang);
        }
    }
}
