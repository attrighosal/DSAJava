package Strategy.FlyNehaviour;

public class NotAbleToFly implements FlyBehaviour{

  @Override
  public void fly() {
    System.out.println("Flying");
  }
}
