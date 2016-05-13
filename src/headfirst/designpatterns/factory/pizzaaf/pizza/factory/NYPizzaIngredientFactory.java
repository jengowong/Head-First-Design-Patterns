package headfirst.designpatterns.factory.pizzaaf.pizza.factory;

import headfirst.designpatterns.factory.pizzaaf.cheese.Cheese;
import headfirst.designpatterns.factory.pizzaaf.cheese.ReggianoCheese;
import headfirst.designpatterns.factory.pizzaaf.clams.Clams;
import headfirst.designpatterns.factory.pizzaaf.clams.FreshClams;
import headfirst.designpatterns.factory.pizzaaf.daugh.Dough;
import headfirst.designpatterns.factory.pizzaaf.daugh.ThinCrustDough;
import headfirst.designpatterns.factory.pizzaaf.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.pizzaaf.sauce.MarinaraSauce;
import headfirst.designpatterns.factory.pizzaaf.sauce.Sauce;
import headfirst.designpatterns.factory.pizzaaf.veggies.Garlic;
import headfirst.designpatterns.factory.pizzaaf.veggies.Mushroom;
import headfirst.designpatterns.factory.pizzaaf.veggies.Onion;
import headfirst.designpatterns.factory.pizzaaf.veggies.RedPepper;
import headfirst.designpatterns.factory.pizzaaf.veggies.Veggies;

/**
 * 工厂具体类：纽约风味披萨食材工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

}
