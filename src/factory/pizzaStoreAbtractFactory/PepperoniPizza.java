package factory.pizzaStoreAbtractFactory;

public class PepperoniPizza extends Pizza {
    IngredientFactory factory;

    public PepperoniPizza(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = factory.creatDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        pepperoni = factory.createPepperoni();
    }
}
