package edu.iu.habahram.coffeeorder.model;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return  Math.round((beverage.cost() + .3F) * 100.0F)/100.0F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
