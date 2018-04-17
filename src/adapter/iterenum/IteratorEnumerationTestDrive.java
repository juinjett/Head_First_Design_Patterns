package adapter.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {

//        List<String> list = Arrays.asList(args);
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        Enumeration<Integer> adapter = new IteratorEnumeration<>(iterator);

        while (adapter.hasMoreElements()) {
            System.out.println(adapter.nextElement());
        }

    }
}
