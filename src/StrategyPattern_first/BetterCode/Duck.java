package StrategyPattern_first.BetterCode;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void perfromFly() {
        flyBehavior.fly();
    }

    public void perfromQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float , evn decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
