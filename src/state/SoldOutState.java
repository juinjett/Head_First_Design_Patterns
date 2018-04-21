package state;

public class SoldOutState implements State{
    GumBallMachine gumBallMachine;

    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Stop, the gumballs are sold out.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("No quater inside.");
    }

    @Override
    public void turnCrank() {
        System.out.println("The gumballs are sold out, you can't turn the crank.");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void refill() {
        System.out.println("More gumballs are refilled.");
        gumBallMachine.setNoQuaterState();

    }

    public String toString() {
        return "sold out";
    }
}
