package strategy.SimUDuck;

// Strategy Pattern: Box different algs seperately and enable interchange among these
// boxes, thus making algs independent of clients.
// In this example, the behaviors of ducks are boxed into a group of classes,
// which is independent of ducks themselves. Such behaviors can be easily changed.

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck md = new MallardDuck();
        md.display();
        md.performFly();
        md.performQuack();
        md.swim();

        Duck dd = new DecoyDuck();
        dd.display();
        dd.performFly();
        dd.performQuack();
        dd.swim();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        model.swim();
        model.setFlyBehavior(new FlyWithRocket());
        model.performFly();
    }

}
