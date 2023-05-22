package decorator;

public class Decaf extends Beverage {
  public Decaf() {
    this.description = "Decaf coffee";
  }

  @Override
  public double cost() {
    return 1.05;
  }
}
