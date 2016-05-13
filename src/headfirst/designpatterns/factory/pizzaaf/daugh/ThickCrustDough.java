package headfirst.designpatterns.factory.pizzaaf.daugh;

import headfirst.designpatterns.factory.pizzaaf.daugh.Dough;

/**
 * 具体类：厚皮
 */
public class ThickCrustDough implements Dough {

    @Override
    public String toString() {
        return "ThickCrust style extra thick crust dough";
    }

}