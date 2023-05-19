package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
  private final List<Observer> observers;
  private double temperature;
  private double humidity;
  private double pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  public void setMeasurements(double temperature, double humidity, double pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i > 0) {
      observers.remove(i);
    }
    System.out.printf("Observer removed: %d", i);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(temperature, humidity, pressure);
    }
  }
}
