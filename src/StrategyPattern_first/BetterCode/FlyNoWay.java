package StrategyPattern_first.BetterCode;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Unable to fly");
    }
}
