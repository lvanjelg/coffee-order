package edu.iu.habahram.coffeeorder.model;

public class Soy extends CondimentDecorator{
    @Override
    public float cost() {
        return .27F;
    }

    @Override
    public String getDescription() {
        return "Soy";
    }
}
