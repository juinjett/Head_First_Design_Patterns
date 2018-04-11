package factory.pizzaStoreFactoryMethod;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sause;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sause...");
        System.out.println("Adding toppings: ");
        for (int i=0; i<toppings.size(); i++) {
            System.out.println("    "+ toppings.get(i));
        }
    }
    public void bake() {
        System.out.println("Bake for 25 min at 350F.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Placing pizza into box.");
        System.out.println("Your " + name + " is ready!\n");
    }

    public String getName() {
        return name;
    }
}
