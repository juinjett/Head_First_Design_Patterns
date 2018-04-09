package observer.WeatherStation;

public class CurrentDisplay implements Observer, DisplayElement {
    private Subject subject;
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature: "+ temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        display();

    }
}
