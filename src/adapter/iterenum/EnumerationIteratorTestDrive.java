package adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>(Arrays.asList("a", "b", "c"));

        Iterator<String> itr = new EnumerationIterator<>(list.elements());
        while (itr.hasNext()) {
            System.out.println(itr.next());
//            itr.remove();
        }
    }
}
