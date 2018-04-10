package decorator.starbuzz;

public class Soy extends CondimentDecorator{
//    Beverage beverage;

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        Size size = beverage.getSize(); // here we get the size of component, because the beverage controls the size.
        if (size == Size.GRANDE) return 0.15 + beverage.cost();
        if (size == Size.VENTI) return 0.20 + beverage.cost();
        return 0.10 + beverage.cost();

    }
}
