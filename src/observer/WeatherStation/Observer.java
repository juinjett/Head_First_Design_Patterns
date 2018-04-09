package observer.WeatherStation;

public interface Observer {
//    void update();

    void update(double temperature, double humidity, double pressure);
}
