package decorator;

public abstract class Beverage {
  protected String description = "Unknown beverage";
  protected BeverageSize size = BeverageSize.TALL;

  public String getDescription() {
    return description;
  }

  public BeverageSize getSize() {
    return size;
  }

  public void setSize(BeverageSize size) {
    this.size = size;
  }

  public abstract double cost();
}
