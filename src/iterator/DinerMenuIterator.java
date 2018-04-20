package iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{
    private MenuItem[] menuItems;
    private int cursor = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return cursor < menuItems.length && menuItems[cursor] != null;
    }

    @Override
    public MenuItem next() {
        return menuItems[cursor++];
    }

    @Override
    public void remove() {
        if (cursor == menuItems.length || menuItems[cursor] == null) return;
        for (int i=cursor; i<menuItems.length-1 && menuItems[i] != null; i++) {
            menuItems[i] = menuItems[i+1];
        }
        menuItems[menuItems.length-1] = null;
    }
}
