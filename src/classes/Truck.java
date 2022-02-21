package classes;

public class Truck extends Car {

  private String carrier;

  public Truck(int wheels, String color, String carrier) {
    super(wheels, color);
    this.carrier = carrier;
  }

  public static void main(String[] args) {
    Truck truck = new Truck(8, "orange", "Small");
    truck.run();
  }
}
