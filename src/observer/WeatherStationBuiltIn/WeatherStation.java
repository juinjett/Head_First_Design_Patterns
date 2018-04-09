package observer.WeatherStationBuiltIn;

import java.util.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 70, 29.2);
        weatherData.setMeasurements(78, 90, 29.2);

        currentDisplay.unsubscribe(weatherData);
        weatherData.setMeasurements(76, 60, 31.6);

        currentDisplay.subscribe(weatherData);
        weatherData.setMeasurements(84, 75, 28.6);
    }
}
