package composite.menuIterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator<E> implements Iterator<E>{
    Stack<Iterator<E>> stack = new Stack<>();

    public CompositeIterator(Iterator<E> itr) {
        stack.push(itr);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) return false;
        Iterator<E> itr = stack.peek();
        if (!itr.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public E next() {
        if (hasNext()) {
            Iterator<E> itr = stack.peek();
            E item = itr.next();
            if (item instanceof Menu) {
                stack.push( ((Menu) item).createIterator());
            }
            return item;
        }
        return null;
    }
}
