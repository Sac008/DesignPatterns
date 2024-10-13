package DecoratorPattern_third.ProblematicCode;

public abstract class Beverage {
    public String description;
    public boolean milk;
    public boolean soy;
    public boolean mocha;
    public boolean whip;

    public abstract String getDescription();

    public double cost() {
        int condimentCost = 0;
        if(hasMilk()) condimentCost += 20;
        if(hasSoy()) condimentCost += 15;
        if(hasMocha()) condimentCost += 25;
        if(hasWhip()) condimentCost += 25;
        return condimentCost;
    }

    public abstract boolean hasMilk();

    public abstract boolean hasSoy();

    public abstract boolean hasMocha();

    public abstract boolean hasWhip();

    public abstract void setMilk(boolean milk);

    public abstract void setSoy(boolean soy);

    public abstract void setMocha(boolean mocha);

    public abstract void setWhip(boolean whip);

}
