package com.github.jengo.dp.hf.factory.pizzaaf.pizza;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.PizzaIngredientFactory;

/**
 * 具体类：蛤蜊披萨
 */
public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.clam = ingredientFactory.createClam();
    }

}
