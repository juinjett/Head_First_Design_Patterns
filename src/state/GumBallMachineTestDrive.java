package state;

import java.util.ArrayList;
import java.util.Iterator;

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

        ArrayList list = new ArrayList();
        Iterable itr = (Iterable) list.iterator();
        Iterator iterator = list.iterator();
        Iterator iterator1 = list.listIterator();
    }
}
