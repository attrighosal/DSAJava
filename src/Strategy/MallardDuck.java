package Strategy;

import Strategy.FlyNehaviour.AbleToFly;

public class MallardDuck extends Duck{

  public MallardDuck() {
    flyBehaviour = new AbleToFly();
  }

  @Override
  public void display() {
    System.out.println("MallardDuck");
  }
}
