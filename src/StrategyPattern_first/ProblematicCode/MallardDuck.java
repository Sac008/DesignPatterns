package StrategyPattern_first.ProblematicCode;

public class MallardDuck extends Duck implements Flyable , Quackable{
    @Override
    public void display() {
        System.out.println("Looks like a mallard duck");
    }

    @Override
    public void swim() {
        System.out.println("Swims like a mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("Flies like a mallard duck");
    }

    @Override
    public void quack() {
        System.out.println("Quacks like a mallard duck");
    }
}
