package com.github.jengo.dp.hf.factory.pizzaaf;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.NYPizzaIngredientFactory;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.PizzaIngredientFactory;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.CheesePizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.ClamPizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.PepperoniPizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.Pizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.VeggiePizza;

/**
 * 具体类：纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(item)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("clam".equals(item)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("pepperoni".equals(item)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }

}
