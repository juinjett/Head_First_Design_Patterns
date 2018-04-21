package state;

public class NoQuaterState implements State{
    GumBallMachine gumBallMachine;

    public NoQuaterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }


    @Override
    public void insertQuater() {
        System.out.println("You inserted a quater.");
        gumBallMachine.setHasQuaterState();
    }

    @Override
    public void ejectQuater() {
        System.out.println("There is no quater inside. You can't get a quater.");
    }

    @Override
    public void turnCrank() {
        System.out.println("There is no quater inside. You can't turn the crank");
    }

    @Override
    public void dispense() {
    }

    @Override
    public void refill() {
        System.out.println("More gumballs are refilled.");
    }

    public String toString() {
        return "waiting for quater";
    }
}
