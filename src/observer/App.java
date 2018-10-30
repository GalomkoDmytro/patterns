package observer;

public class App {

    public static void main(String[] args) {
        Meteostation station = new Meteostation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new ConsoleObserver());

        station.setMeasurment(10, 620);
        station.setMeasurment(-2, 720);
    }
}
