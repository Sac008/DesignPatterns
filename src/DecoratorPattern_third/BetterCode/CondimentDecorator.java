package DecoratorPattern_third.BetterCode;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    public abstract String getDescription();
}
