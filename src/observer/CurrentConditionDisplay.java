package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
  Observable observable;
  private double temperature;
  private double humidity;

  public CurrentConditionDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void update(Observable observable, Object arg) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  @Override
  public void display() {
    System.out.printf("Current conditions: %.2fF degrees and %.2f%% humidity %n", temperature, humidity);
  }
}
