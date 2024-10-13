package DecoratorPattern_third.ProblematicCode;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setMilk(true);
        beverage.setWhip(true);
        System.out.println(beverage.cost());
    }
}
