package headfirst.designpatterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        RubberDuck rubber = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallard.performQuack();
        rubber.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
