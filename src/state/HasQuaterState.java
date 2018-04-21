package state;

import java.util.Random;

public class HasQuaterState implements State{
    GumBallMachine gumBallMachine;
    Random random = new Random(System.currentTimeMillis());

    public HasQuaterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("You have already inserted a quater.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Ejecting the quater...");
        gumBallMachine.setNoQuaterState();
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning the crank...");
        if (random.nextInt(2) == 0 && gumBallMachine.getCount() >= 2) {
            gumBallMachine.setWinnerState();
        }
        else gumBallMachine.setSoldState();
    }

    @Override
    public void dispense() {
    }

    @Override
    public void refill() {
        System.out.println("More gumballs are refilled.");
    }

    public String toString() {
        return "getting your quarter and waiting for pulling crank";
    }
}
