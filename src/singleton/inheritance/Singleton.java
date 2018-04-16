package singleton.inheritance;

public class Singleton {
    protected static Singleton singleton;

    protected Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void getDescription() {
        System.out.println("This is an inheritable Singleton");
    }
}
