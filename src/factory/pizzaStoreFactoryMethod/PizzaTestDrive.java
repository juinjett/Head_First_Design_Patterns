package factory.pizzaStoreFactoryMethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("Cheese");
        store.orderPizza("pepperoni");
    }
}
