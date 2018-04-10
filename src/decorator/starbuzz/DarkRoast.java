package decorator.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    public DarkRoast(Size size) {
        this();
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
