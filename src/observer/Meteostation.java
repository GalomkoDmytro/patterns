package observer;

import java.util.ArrayList;
import java.util.List;

public class Meteostation implements Observed {
    int temp;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMeasurment(int t, int p) {
        temp = t;
        pressure = p;
        notifyOserver();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyOserver() {
        observers.stream().forEach(o -> o.handlEvent(temp, pressure));
    }
}
