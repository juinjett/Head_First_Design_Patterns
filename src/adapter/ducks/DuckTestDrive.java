package adapter.ducks;

public class DuckTestDrive {
    public static void testDuck (Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        Duck md = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdpater = new TurkeyAdapter(turkey);

        System.out.println("Duck says:");
        testDuck(md);
        System.out.println("Turkey Adapter says:");
        testDuck(turkeyAdpater);

    }
}
