package singleton.inheritance;

public class HotterSingleton extends Singleton{
    private HotterSingleton() {
        super();
    }

    @Override
    public void getDescription() {
        System.out.println("This is Hotter Singleton");
    }
}
