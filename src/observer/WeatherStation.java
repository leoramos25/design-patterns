package observer;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 39.3f);
    weatherData.setMeasurements(78, 90, 39.2f);
  }
}
