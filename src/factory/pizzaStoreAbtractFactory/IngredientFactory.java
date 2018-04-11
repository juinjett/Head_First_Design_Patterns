package factory.pizzaStoreAbtractFactory;

public interface IngredientFactory {
    Dough creatDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
