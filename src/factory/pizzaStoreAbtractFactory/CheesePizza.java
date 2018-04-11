package factory.pizzaStoreAbtractFactory;

public class CheesePizza extends Pizza {
    IngredientFactory factory;

    public CheesePizza(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = factory.creatDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}
