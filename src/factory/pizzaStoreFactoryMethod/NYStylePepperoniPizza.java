package factory.pizzaStoreFactoryMethod;

public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sause = "Mariana Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
    }
}
