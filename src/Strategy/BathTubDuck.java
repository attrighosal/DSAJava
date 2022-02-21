package Strategy;

import Strategy.FlyNehaviour.NotAbleToFly;

public class BathTubDuck extends Duck {

  public BathTubDuck() {
    flyBehaviour = new NotAbleToFly();
  }
  @Override
  public void display() {
    System.out.println("BathTubDuck");
  }
}
