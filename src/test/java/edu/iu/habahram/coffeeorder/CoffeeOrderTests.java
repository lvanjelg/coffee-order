package edu.iu.habahram.coffeeorder;

import edu.iu.habahram.coffeeorder.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeOrderTests {
    @Test
    void DarkRoastTest(){
        DarkRoast d = new DarkRoast();
        assertEquals("Dark roast",d.getDescription());
        assertEquals(1.99F,d.cost());
    }
    @Test
    void DecafTest(){
        Decaf d = new Decaf();
        assertEquals("Decaf",d.getDescription());
        assertEquals(1.28F,d.cost());
    }
    @Test
    void EspressoTest(){
        Espresso e = new Espresso();
        assertEquals("Espresso",e.getDescription());
        assertEquals(1.35F,e.cost());
    }
    @Test
    void HouseBlendTest(){
        HouseBlend h = new HouseBlend();
        assertEquals("House Blend",h.getDescription());
        assertEquals(1.65F,h.cost());
    }
    @Test
    void MilkTest(){
        Milk dr = new Milk(new DarkRoast());
        assertEquals("Dark roast, Milk",dr.getDescription());
        assertEquals(2.39F,dr.cost());
    }
    @Test
    void MochaTest(){
        Mocha dr = new Mocha(new DarkRoast());
        assertEquals("Dark roast, Mocha",dr.getDescription());
        assertEquals(2.29F,dr.cost());
    }
    @Test
    void SoyTest(){
        Soy dr = new Soy(new DarkRoast());
        assertEquals("Dark roast, Soy",dr.getDescription());
        assertEquals(2.26F,dr.cost());
    }
    @Test
    void WhipTest(){
        Whip dr = new Whip(new DarkRoast());
        assertEquals("Dark roast, Whip", dr.getDescription());
        assertEquals(2.24F,dr.cost());
    }
    @Test
    void BeverageTest1(){
        Mocha d = new Mocha(new Whip(new DarkRoast()));
        assertEquals("Dark roast, Whip, Mocha", d.getDescription());
        assertEquals(2.54F,d.cost());
    }
    @Test
    void BeverageTest2(){
        Soy d = new Soy(new Mocha(new Whip(new DarkRoast())));
        assertEquals("Dark roast, Whip, Mocha, Soy", d.getDescription());
        assertEquals(2.81F,d.cost());
    }
    @Test
    void BeverageTest3(){
        Milk d = new Milk(new Mocha(new HouseBlend()));
        assertEquals("House Blend, Mocha, Milk",d.getDescription());
        assertEquals(2.35F,d.cost());
    }
    @Test
    void BeverageTest4(){
        Whip d = new Whip(new Whip(new Decaf()));
        assertEquals("Decaf, Whip, Whip",d.getDescription());
        assertEquals(1.78F,d.cost());
    }
    @Test
    void BeverageTest5(){
        Mocha d = new Mocha(new Mocha(new Mocha(new Espresso())));
        assertEquals("Espresso, Mocha, Mocha, Mocha",d.getDescription());
        assertEquals(2.25F,d.cost());
    }
    @Test
    void BeverageTest6(){
        Whip d = new Whip(new Milk(new Espresso()));
        assertEquals("Espresso, Milk, Whip", d.getDescription());
        assertEquals(2F,d.cost());
    }
    @Test
    void BeverageTest7(){
        Mocha d = new Mocha(new Milk(new Espresso()));
        assertEquals("Espresso, Milk, Mocha",d.getDescription());
        assertEquals(2.05F,d.cost());
    }
    @Test
    void BeverageTest8(){
        Mocha d = new Mocha(new Soy(new Milk(new Mocha(new Espresso()))));
        assertEquals("Espresso, Mocha, Milk, Soy, Mocha",d.getDescription());
        assertEquals(2.62F,d.cost());
    }
}
