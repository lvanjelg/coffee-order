package edu.iu.habahram.coffeeorder.model;

public class Whip extends CondimentDecorator{
    @Override
    public float cost() {
        return .25F;
    }

    @Override
    public String getDescription() {
        return "Whip";
    }
}
