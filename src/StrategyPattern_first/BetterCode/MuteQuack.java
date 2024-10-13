package StrategyPattern_first.BetterCode;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence quack");
    }
}
