package com.github.jengo.dp.hf.factory.pizzaaf.pizza;

import com.github.jengo.dp.hf.factory.pizzaaf.pizza.factory.PizzaIngredientFactory;

/**
 * 具体类：蛤蜊披萨
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }

}