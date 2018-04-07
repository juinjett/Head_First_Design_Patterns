package SimUDuck;

public class ModelDuck extends Duck{
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }


}
