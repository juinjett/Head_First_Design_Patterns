package decorator.starbuzz;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    public HouseBlend(Size size) {
        this();
        this.size = size;
    }

    @Override
    public double cost() {
        Size size = getSize();
        if (size == Size.GRANDE) return 1.09;
        if (size == Size.VENTI) return 1.29;
        return 0.89;
    }


}
