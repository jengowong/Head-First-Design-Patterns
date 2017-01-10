package com.github.jengo.dp.hf.factory.pizzaaf.pizza.factory;

import com.github.jengo.dp.hf.factory.pizzaaf.cheese.Cheese;
import com.github.jengo.dp.hf.factory.pizzaaf.cheese.ReggianoCheese;
import com.github.jengo.dp.hf.factory.pizzaaf.clams.Clams;
import com.github.jengo.dp.hf.factory.pizzaaf.clams.FreshClams;
import com.github.jengo.dp.hf.factory.pizzaaf.daugh.Dough;
import com.github.jengo.dp.hf.factory.pizzaaf.daugh.ThinCrustDough;
import com.github.jengo.dp.hf.factory.pizzaaf.pepperoni.Pepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.pepperoni.SlicedPepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.sauce.MarinaraSauce;
import com.github.jengo.dp.hf.factory.pizzaaf.sauce.Sauce;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.Garlic;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.Mushroom;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.Onion;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.RedPepper;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.Veggies;

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
