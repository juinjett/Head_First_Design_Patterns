package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu implements Menu<MenuItem>{
    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "", true, 2.99);
        addItem("BLT", "", false, 2.99);
        addItem("Soup of the day", "", false, 3.99);
        addItem("Hotdog", "", false, 3.05);
        addItem("Health Salad", "", true, 2.05);
    }

    public void addItem (String name, String desc, boolean veggy, double price) {
        if (numberOfItems == MAX_ITEMS) System.out.println("Cannot add more, menu is full!");

        MenuItem item = new MenuItem(name, desc, veggy, price);
        menuItems[numberOfItems++] = item;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        for (MenuItem item: dinerMenu.getMenuItems()) {
            System.out.println(item.toString());
        }
    }

    @Override
    public Iterator<MenuItem> creatIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
