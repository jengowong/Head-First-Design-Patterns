package headfirst.designpatterns.factory.pizzaaf.pizza.factory;

import headfirst.designpatterns.factory.pizzaaf.cheese.Cheese;
import headfirst.designpatterns.factory.pizzaaf.cheese.MozzarellaCheese;
import headfirst.designpatterns.factory.pizzaaf.clams.Clams;
import headfirst.designpatterns.factory.pizzaaf.clams.FrozenClams;
import headfirst.designpatterns.factory.pizzaaf.daugh.Dough;
import headfirst.designpatterns.factory.pizzaaf.daugh.ThickCrustDough;
import headfirst.designpatterns.factory.pizzaaf.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.pizzaaf.sauce.PlumTomatoSauce;
import headfirst.designpatterns.factory.pizzaaf.sauce.Sauce;
import headfirst.designpatterns.factory.pizzaaf.veggies.BlackOlives;
import headfirst.designpatterns.factory.pizzaaf.veggies.Eggplant;
import headfirst.designpatterns.factory.pizzaaf.veggies.Spinach;
import headfirst.designpatterns.factory.pizzaaf.veggies.Veggies;

/**
 * 工厂具体类：芝加哥风味披萨食材工厂
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

}
