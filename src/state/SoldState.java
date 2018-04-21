package state;

public class SoldState implements State{
    GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Stop, you have already inserted a quater.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("You have turned the crank. No quater will be returned.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning crank again... Nothing happens now.");
    }

    @Override
    public void dispense() {
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() > 0) {
            gumBallMachine.setNoQuaterState();
        }
        else {
            gumBallMachine.setSoldOutState();
        }
    }

    @Override
    public void refill() {
        System.out.println("More gumballs are refilled.");
    }

    public String toString() {
        return "dispensing the gum ball";
    }
}
