package singleton.inheritance;

public class CoolerSingleton extends Singleton{

    protected static Singleton singleton;

    private CoolerSingleton() {
        super();
    }


    @Override
    public void getDescription() {
        System.out.println("This is Cooler Singleton");
    }
}
