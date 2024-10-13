package DecoratorPattern_third.BetterCode;

import DecoratorPattern_third.BetterCode.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 19;
    }
}
