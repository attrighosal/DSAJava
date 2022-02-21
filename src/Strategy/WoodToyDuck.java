package Strategy;

public class WoodToyDuck extends Duck{

  @Override
  public void fly() {
    System.out.println("Can not fly");
  }

  @Override
  public void display() {
    System.out.println("WoodToyDuck");
  }
}
