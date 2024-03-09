package edu.iu.habahram.coffeeorder.model;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return  Math.round((beverage.cost() + .4F) * 100.0F)/100.0F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
