package observer.WeatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int idx = observers.indexOf(o);
        if (idx >= 0) observers.remove(idx);

    }

    @Override
    public void notifyObserver() {
        for (Observer each: observers) {
            each.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements (double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
