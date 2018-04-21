package state;

public class GumBallMachine {
    private int count;
    private State noQuaterState;
    private State hasQuaterState;
    private State soldOutState;
    private State soldState;
    private State winnerState;
    private State state;

    public GumBallMachine(int count) {
        noQuaterState = new NoQuaterState(this);
        hasQuaterState = new HasQuaterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        if (count > 0) state = noQuaterState;
        else state = soldOutState;
    }

    public void insertQuarter(){
        state.insertQuater();
    }

    public void ejectQuater(){
        state.ejectQuater();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public int getCount() {
        return count;
    }

    public void setHasQuaterState() {
        state = hasQuaterState;
    }

    public void setNoQuaterState() {
        state = noQuaterState;
    }

    public void setSoldState() {
        state = soldState;
    }

    public void setSoldOutState() {
        state = soldOutState;
    }

    public void setWinnerState() {
        state = winnerState;
    }
    public void releaseBall() {
        System.out.println("A gum ball is coming out...");
        if (count > 0) count--;
    }

    public void refill(int i) {
        count += i;
        state.refill();
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
