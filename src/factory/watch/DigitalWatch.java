package abstractFactory.watch;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("digital watch");
    }
}
