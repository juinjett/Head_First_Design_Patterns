package factory.pizzaStoreFactoryMethod;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) throws RuntimeException {
        Pizza pizza = createPizza(type);

        if (pizza == null) throw new RuntimeException("Invalid pizza type!!");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
