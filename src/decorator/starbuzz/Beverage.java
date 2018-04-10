package decorator.starbuzz;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}
    Size size = Size.TALL;

    String description = "Unknown discription";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
