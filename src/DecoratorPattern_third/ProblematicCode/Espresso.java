package DecoratorPattern_third.ProblematicCode;

public class Espresso extends Beverage{
    @Override
    public String getDescription() {
        return "Espresso ordered";
    }


    public double cost() {
        double totalCost = super.cost();
        return totalCost += 100;
    }

    @Override
    public boolean hasMilk() {
        return milk;
    }

    @Override
    public boolean hasSoy() {
        return soy;
    }

    @Override
    public boolean hasMocha() {
        return mocha;
    }

    @Override
    public boolean hasWhip() {
        return whip;
    }

    @Override
    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    @Override
    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    @Override
    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
