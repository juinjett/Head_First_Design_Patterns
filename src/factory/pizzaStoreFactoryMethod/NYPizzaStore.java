package factory.pizzaStoreFactoryMethod;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if (type.toLowerCase().equals("cheese")) return new NYStyleCheesePizza();
        if (type.toLowerCase().equals("clam")) return new NYStyleClamPizza();
        if (type.toLowerCase().equals("pepperoni")) return new NYStylePepperoniPizza();
        return null;
    }
}
