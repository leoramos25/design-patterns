package observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
  private double temperature;
  private double humidity;
  private Subject weatherData;

  public CurrentConditionDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(double temperature, double humidity, double pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.printf("Current conditions: %.2fF degrees and %.2f%% humidity %n", temperature, humidity);
  }
}
