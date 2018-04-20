package iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu<MenuItem> dinerMenu = new DinerMenu();
        Menu<MenuItem> pancakeMenu = new PancakeMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeMenu);
        waitress.printMenu();
    }
}
