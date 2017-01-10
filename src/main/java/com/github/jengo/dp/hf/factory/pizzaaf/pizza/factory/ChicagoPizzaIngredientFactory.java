package com.github.jengo.dp.hf.factory.pizzaaf.pizza.factory;

import com.github.jengo.dp.hf.factory.pizzaaf.cheese.Cheese;
import com.github.jengo.dp.hf.factory.pizzaaf.cheese.MozzarellaCheese;
import com.github.jengo.dp.hf.factory.pizzaaf.clams.Clams;
import com.github.jengo.dp.hf.factory.pizzaaf.clams.FrozenClams;
import com.github.jengo.dp.hf.factory.pizzaaf.daugh.Dough;
import com.github.jengo.dp.hf.factory.pizzaaf.daugh.ThickCrustDough;
import com.github.jengo.dp.hf.factory.pizzaaf.pepperoni.Pepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.pepperoni.SlicedPepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.sauce.PlumTomatoSauce;
import com.github.jengo.dp.hf.factory.pizzaaf.sauce.Sauce;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.BlackOlives;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.Eggplant;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.Spinach;
import com.github.jengo.dp.hf.factory.pizzaaf.veggies.Veggies;

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
