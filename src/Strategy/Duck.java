package Strategy;

import Strategy.FlyNehaviour.FlyBehaviour;

public abstract class Duck {
  FlyBehaviour flyBehaviour;
  public void fly() {
    flyBehaviour.fly();
  }
  public abstract void display();
}
