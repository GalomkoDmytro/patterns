package factory;

import factory.watch.DigitalWatchMacker;
import factory.watch.Watch;
import factory.watch.WatchMacker;
    
public class App {
    public static void main(String[] args) {
        WatchMacker maker = new DigitalWatchMacker();
        Watch watch = maker.createWatch();
        watch.showTime();
    }
}
