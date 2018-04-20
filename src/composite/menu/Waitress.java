package composite.menu;

import composite.menuIterator.MenuComponent;

public class Waitress {
    MenuComponent component;

    public Waitress(MenuComponent component) {
        this.component = component;
    }

    public void printMenu() {
        component.print();
    }
}
