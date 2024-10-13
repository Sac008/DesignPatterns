package DecoratorPattern_third.BetterCode;

import DecoratorPattern_third.BetterCode.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend";
    }

    public double cost() {
        return 100;
    }
}
