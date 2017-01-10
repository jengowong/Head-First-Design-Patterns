package com.github.jengo.dp.hf.strategy;

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
