package Strategy.FlyNehaviour;

public class AbleToFly  implements FlyBehaviour{
  @Override
  public void fly() {
    System.out.println("Flying");
  }
}
