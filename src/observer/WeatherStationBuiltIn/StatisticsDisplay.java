package observer.WeatherStationBuiltIn;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private double maxTemp;
    private double minTemp;
    private double avgTemp;
    private double sumTemp;
    private int count;
    private Observable subject;

    public StatisticsDisplay(Observable subject) {
        this.maxTemp = Double.MIN_VALUE;
        this.minTemp = Double.MAX_VALUE;
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min Temperature: " + avgTemp +"/" + maxTemp + "/" + minTemp);
    }

    public void updateStatus(double temperature) {
        if (maxTemp < temperature) maxTemp = temperature;
        if (minTemp > temperature) minTemp = temperature;
        sumTemp += temperature;
        avgTemp = sumTemp / ++count;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            double temperature = weatherData.getTemperature();
            updateStatus(temperature);
            display();
        }
    }
}
