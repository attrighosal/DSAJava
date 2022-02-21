package Strategy;

import Strategy.FlyNehaviour.AbleToFly;

public class RedHeadDuck extends Duck{

  public RedHeadDuck() {
    flyBehaviour = new AbleToFly();
  }

  @Override
  public void display() {
    System.out.println("RedHead Duck");
  }
}
