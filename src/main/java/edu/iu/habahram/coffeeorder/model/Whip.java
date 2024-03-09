package edu.iu.habahram.coffeeorder.model;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return Math.round((beverage.cost() + .25F) * 100.0F)/100.0F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
