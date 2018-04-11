package factory.pizzaStoreAbtractFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory factory = new NYIngredientFactory();
        if (type.toLowerCase().equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("NY Cheese Pizza");
        }
        else if (type.toLowerCase().equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("NY Clam Pizza");
        }
        else if (type.toLowerCase().equals("pepperoni")) {
            pizza = new PepperoniPizza(factory);
            pizza.setName("NY Pepperoni Pizza");
        }
        else if (type.toLowerCase().equals("veggies")) {
            pizza = new VeggiesPizza(factory);
            pizza.setName("NY Veggies Pizza");
        }
        return pizza;
    }
}
