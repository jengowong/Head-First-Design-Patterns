package com.github.jengo.dp.hf.factory.pizzaaf.ingredient;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.cheese.Cheese;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.clams.Clams;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.daugh.Dough;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.sauce.Sauce;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Veggies;

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
