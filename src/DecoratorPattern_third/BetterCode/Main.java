package DecoratorPattern_third.BetterCode;

public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        Beverage beverage2 = new Mocha(beverage);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
