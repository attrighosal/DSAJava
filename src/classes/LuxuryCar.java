package classes;

public class LuxuryCar {
  Car car;
  String nitro;
  String sunRoof;

  public LuxuryCar(int wheels, String color, String nitro, String sunroof) {
    car = new Car(wheels, color);
    this.nitro = nitro;
    this.sunRoof = sunroof;
  }
  public void run() {
    car.run();
  }

  public static void main(String[] args) {
    LuxuryCar luxuryCar = new LuxuryCar(4, "blue", "abc", "def");
    luxuryCar.run();
  }

}
