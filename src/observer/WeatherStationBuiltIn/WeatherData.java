package observer.WeatherStationBuiltIn;

import java.util.Observable;

public class WeatherData extends Observable {
    private double temperature;
    private double humidity;
    private double pressure;


    public void measurementsChanged() {
        setChanged();
        notifyObservers();  /* we are not passing args here, which means
                                we are going to "pull" updates */

    }

    public void setMeasurements (double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
