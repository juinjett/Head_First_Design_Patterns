package composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements MenuComponent {
    ArrayList<MenuComponent> componentList = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        componentList.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        componentList.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return componentList.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------");

        Iterator<MenuComponent> iter = componentList.iterator();
        while (iter.hasNext()) {
            MenuComponent component = iter.next();
            component.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return componentList.iterator();
    }
}
