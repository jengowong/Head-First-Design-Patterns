package com.github.jengo.dp.hf.factory.pizzaaf.ingredient;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.cheese.Cheese;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.cheese.ReggianoCheese;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.clams.Clams;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.clams.FreshClams;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.daugh.Dough;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.daugh.ThinCrustDough;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.pepperoni.SlicedPepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.sauce.MarinaraSauce;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.sauce.Sauce;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Garlic;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Mushroom;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Onion;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.RedPepper;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Veggies;

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
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
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
