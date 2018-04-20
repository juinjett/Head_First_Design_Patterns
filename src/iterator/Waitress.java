package iterator;

import java.util.Iterator;

public class Waitress {
    Menu<MenuItem> dinerMenu;
    Menu<MenuItem> pancakeMenu;
    public Waitress(Menu dinerMenu, Menu pancakeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeMenu = pancakeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> dinerItr = dinerMenu.creatIterator();
        Iterator<MenuItem> pancakeItr = pancakeMenu.creatIterator();
        System.out.println("Menu\n" + "-----\n" + "Breakfast");
        printMenu(pancakeItr);
        System.out.println("Diner");
        printMenu(dinerItr);
    }

    public void printMenu(Iterator itr) {
        while (itr.hasNext()) {
            MenuItem curr = (MenuItem) itr.next();
            System.out.println(curr.getName() + ": " + curr.getPrice());
        }
    }

    public void printBreakfastMenu() {

    }

    public void printLunchMenu() {

    }

    public void printVeggyMenu() {}

    public boolean isVeggy(String name) {
       	return true;
    }
}
