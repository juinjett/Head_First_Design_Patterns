package factory.pizzaStoreAbtractFactory;

public class ClamPizza extends Pizza {
    IngredientFactory factory;

    public ClamPizza(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = factory.creatDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clams = factory.createClams();
        System.out.println("Adding " + dough.toString());
        System.out.println("Adding " + sauce.toString());
        System.out.println("Adding " + cheese.toString());
        System.out.println("Adding " + clams.toString());
    }
}
