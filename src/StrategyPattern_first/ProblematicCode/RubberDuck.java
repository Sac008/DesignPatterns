package StrategyPattern_first.ProblematicCode;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("Looks like a RubberDuck");
    }

    @Override
    public void swim() {
        System.out.println("Swims great as it is a RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("It squeaks");
    }
}
