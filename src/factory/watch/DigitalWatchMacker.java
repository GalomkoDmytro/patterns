package factory.watch;

public class DigitalWatchMacker implements WatchMacker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
