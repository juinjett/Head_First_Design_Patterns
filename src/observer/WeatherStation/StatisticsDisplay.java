package observer.WeatherStation;

public class StatisticsDisplay implements Observer, DisplayElement{
    private double maxTemp;
    private double minTemp;
    private double avgTemp;
    private double sumTemp;
    private int count;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.maxTemp = Double.MIN_VALUE;
        this.minTemp = Double.MAX_VALUE;
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min Temperature: " + avgTemp +"/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if (maxTemp < temperature) maxTemp = temperature;
        if (minTemp > temperature) minTemp = temperature;
        sumTemp += temperature;
        avgTemp = sumTemp / ++count;
        display();
    }
}
