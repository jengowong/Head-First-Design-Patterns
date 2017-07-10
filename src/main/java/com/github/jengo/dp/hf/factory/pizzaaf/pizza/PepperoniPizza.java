package com.github.jengo.dp.hf.factory.pizzaaf.pizza;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.PizzaIngredientFactory;

/**
 * 具体类：香肠披萨
 */
public class PepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.veggies = ingredientFactory.createVeggies();
        this.pepperoni = ingredientFactory.createPepperoni();
    }

}
