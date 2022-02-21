package classes;

public class Car {
  private int wheels;
  private String color;

  public Car(int wheels, String color) {
    this.wheels = wheels;
    this.color = color;
  }

  public int getWheels() {
    return wheels;
  }

  public String getColor() {
    return color;
  }

  public void run() {
    System.out.println("Moving");
  }
}
