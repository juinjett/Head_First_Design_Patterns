package observer.WeatherStationBuiltIn;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, DisplayElement {
    private Observable subject;
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentDisplay(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature: "+ temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void subscribe(Observable observable) {
        if (this.subject != null && this.subject.equals(observable)) return;
        this.subject = observable;
        subject.addObserver(this);
    }


    public void unsubscribe(Observable observable) {
        if (this.subject == null || !this.subject.equals(observable)) return;
        subject.deleteObserver(this);
        this.subject = null;
    }
}
