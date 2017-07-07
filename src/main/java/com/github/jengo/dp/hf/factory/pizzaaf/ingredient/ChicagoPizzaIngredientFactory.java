package com.github.jengo.dp.hf.factory.pizzaaf.ingredient;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.cheese.Cheese;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.cheese.MozzarellaCheese;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.clams.Clams;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.clams.FrozenClams;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.daugh.Dough;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.daugh.ThickCrustDough;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.pepperoni.SlicedPepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.sauce.PlumTomatoSauce;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.sauce.Sauce;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.BlackOlives;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Eggplant;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Spinach;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Veggies;

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
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
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
