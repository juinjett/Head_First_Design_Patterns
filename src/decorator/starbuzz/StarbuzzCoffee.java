package decorator.starbuzz;

/*
   Decorator Pattern: Dynamically extend functions of an object without using inheritance.
   It complies with the rule: more composition, less inheritance.
 */
public class StarbuzzCoffee {
    public static void print(Beverage beverage) {
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());
    }

    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        print(b1);

        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Milk(b2);
        print(b2);

        Beverage b3 = new HouseBlend();
        b3 = new Soy(b3);
        b3 = new Mocha(b3);
        b3 = new Milk(b3);
        print(b3);

        // If customer orders a Venti, the component and decorators will change accordingly
        Beverage b4 = new HouseBlend(Beverage.Size.VENTI);
        System.out.println(b4.size);
        b4 = new Soy(b4);
        print(b4);

    }

}
