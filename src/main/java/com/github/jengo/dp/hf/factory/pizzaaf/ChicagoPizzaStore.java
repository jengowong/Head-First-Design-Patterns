package com.github.jengo.dp.hf.factory.pizzaaf;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.ChicagoPizzaIngredientFactory;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.PizzaIngredientFactory;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.CheesePizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.ClamPizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.PepperoniPizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.Pizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.VeggiePizza;

/**
 * 具体类：芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }

}
