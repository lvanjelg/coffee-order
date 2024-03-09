package edu.iu.habahram.coffeeorder.model;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return Math.round((beverage.cost() + .27F) * 100.0F)/100.0F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
