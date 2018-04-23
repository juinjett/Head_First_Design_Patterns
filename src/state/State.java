package state;

import java.util.ListIterator;

public interface State {
    void insertQuater();

    void ejectQuater();

    void turnCrank();

    void dispense();

    void refill();
}
