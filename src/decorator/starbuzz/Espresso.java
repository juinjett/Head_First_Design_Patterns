package decorator.starbuzz;

public class Espresso extends Beverage{
    public Espresso() {
        this.description = "Espresso";
    }

    public Espresso(Size size) {
        this();
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
