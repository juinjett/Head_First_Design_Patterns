package factory.pizzaStoreAbtractFactory;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 min at 350F.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Placing pizza into box.");
        System.out.println("Your " + name +" is ready! \n");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
