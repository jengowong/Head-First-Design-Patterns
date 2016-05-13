package headfirst.designpatterns.factory.pizzaaf.pizza.factory;

import headfirst.designpatterns.factory.pizzaaf.cheese.Cheese;
import headfirst.designpatterns.factory.pizzaaf.clams.Clams;
import headfirst.designpatterns.factory.pizzaaf.daugh.Dough;
import headfirst.designpatterns.factory.pizzaaf.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.sauce.Sauce;
import headfirst.designpatterns.factory.pizzaaf.veggies.Veggies;

/**
 * 抽象类：披萨食材工厂(抽象工厂)
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
