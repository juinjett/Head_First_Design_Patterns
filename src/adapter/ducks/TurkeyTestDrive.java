package adapter.ducks;

public class TurkeyTestDrive {
    public static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck md = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(md);

        System.out.println("Turkey says:");
        testTurkey(turkey);
        System.out.println("DuckAdapter says:");
        testTurkey(duckAdapter);
    }
}
