package com.github.jengo.dp.hf.factory.pizzaaf.pizza.factory;

import com.github.jengo.dp.hf.factory.pizzaaf.cheese.Cheese;
import com.github.jengo.dp.hf.factory.pizzaaf.clams.Clams;
import com.github.jengo.dp.hf.factory.pizzaaf.daugh.Dough;
import com.github.jengo.dp.hf.factory.pizzaaf.pepperoni.Pepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.sauce.Sauce;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.Veggies;

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
