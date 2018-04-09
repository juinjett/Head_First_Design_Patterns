package strategy.SimUDuck;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with rocket!!");
    }
}
