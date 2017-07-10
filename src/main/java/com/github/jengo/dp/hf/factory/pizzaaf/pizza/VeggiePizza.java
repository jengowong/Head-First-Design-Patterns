package com.github.jengo.dp.hf.factory.pizzaaf.pizza;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.PizzaIngredientFactory;

/**
 * 具体类：蔬菜披萨
 */
public class VeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.veggies = ingredientFactory.createVeggies();
    }

}
