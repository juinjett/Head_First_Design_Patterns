package state;

public class GumBallMachineTestDrive {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(2);

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        gumBallMachine.refill(5);

        System.out.println(gumBallMachine);
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);
    }
}
