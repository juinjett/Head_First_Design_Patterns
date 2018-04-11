package factory.pizzaStoreAbtractFactory;

public class VeggiesPizza extends Pizza {
    IngredientFactory factory;

    public VeggiesPizza(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = factory.creatDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        veggies = factory.createVeggies();
    }
}
