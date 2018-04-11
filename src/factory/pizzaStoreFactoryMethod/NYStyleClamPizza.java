package factory.pizzaStoreFactoryMethod;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sause = "Mariana Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island");
    }
}
