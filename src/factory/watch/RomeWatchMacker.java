package factory.watch;

public class RomeWatchMacker implements WatchMacker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
