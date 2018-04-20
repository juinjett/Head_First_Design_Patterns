package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator<MenuItem>{
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private int cursor = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return cursor < menuItems.size();
    }

    @Override
    public MenuItem next() {
        return menuItems.get(cursor++);
    }
}
