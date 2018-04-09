package strategy.SimUDuck;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I have no life, I can't fly");
    }
}
