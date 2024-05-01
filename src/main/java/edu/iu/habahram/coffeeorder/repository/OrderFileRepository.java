package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.*;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;

public class OrderFileRepository {
    private int OrderCount = 0;
    public Receipt add(OrderData order) throws Exception {
        Beverage beverage = null;
        switch (order.getBeverage().toLowerCase()) {
            case "dark roast":
                beverage = new DarkRoast();
                break;
            case "decaf":
                beverage = new Decaf();
                break;
            case "espresso":
                beverage = new Espresso();
                break;
            case "house blend":
                beverage = new HouseBlend();
                break;
        }
        if (beverage == null) {
            throw new Exception("Beverage type '%s' is not valid!".formatted(order.getBeverage()));
        }
        for(String condiment : order.getCondiments()) {
            switch (condiment.toLowerCase()) {
                case "milk":
                   beverage = new Milk(beverage);
                   break;
                case "mocha":
                    beverage = new Mocha(beverage);
                    break;
                case "soy":
                    beverage = new Soy(beverage);
                    break;
                case "whip":
                    beverage = new Whip(beverage);
                    break;
                default:
                    throw new Exception("Condiment type '%s' is not valid".formatted(condiment));
            }
        }
        Receipt receipt = new Receipt(OrderCount ,beverage.getDescription(), beverage.cost());
        FileWriter w = new FileWriter("db.txt",true);
        w.write(String.valueOf(OrderCount) + ", " + beverage.getDescription() + ", " + beverage.cost());
        w.close();
        OrderCount += 1;
        return receipt;
    }
}
