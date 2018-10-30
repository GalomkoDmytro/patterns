package observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handlEvent(int temp, int presser) {
        System.out.println("Weather is changed. T: " + temp +"; P: " + presser);
    }
}
