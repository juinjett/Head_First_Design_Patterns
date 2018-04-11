package factory.pizzaStoreFactoryMethod;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sause = "Mariana Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
