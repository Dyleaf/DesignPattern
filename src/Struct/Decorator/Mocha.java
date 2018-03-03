package Struct.Decorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return beverage.cost() + 0.20;
    }
}