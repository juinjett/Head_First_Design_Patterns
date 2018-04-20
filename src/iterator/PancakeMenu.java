package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenu implements Menu<MenuItem> {
    ArrayList<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake", "", true, 2.99);
        addItem("Regular Pancake", "", false, 2.99);
        addItem("Blueberry Pancake", "", true, 3.49);
        addItem("Waffles", "", true, 3.59);
    }

    public void addItem (String name, String desc, boolean veggy, double price) {
        MenuItem item = new MenuItem(name, desc, veggy, price);
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> creatIterator() {
        return menuItems.iterator();
    }

}
