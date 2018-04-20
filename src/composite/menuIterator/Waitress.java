package composite.menuIterator;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> itr = allMenus.createIterator();
        System.out.println("\n---- Vegeterian Menu ----");
        while (itr.hasNext()) {
            MenuComponent component = itr.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
