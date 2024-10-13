package StrategyPattern_first.BetterCode;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.perfromFly();
        mallard.perfromQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.perfromFly(); // Initially it will use FlyNoWay instance assigned in ModelDuck Constructor
        modelDuck.setFlyBehavior(new FlyRocketPowered()); // Set the flying type dynamically.
        modelDuck.perfromFly(); // Now it will use FlyRocketPowered() instance that we set dynamically just now.
    }
}
