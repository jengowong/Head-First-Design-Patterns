package com.github.jengo.dp.hf.factory.pizzaaf;

import com.github.jengo.dp.hf.factory.pizzaaf.pizza.CheesePizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.ClamPizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.PepperoniPizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.Pizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.VeggiePizza;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.factory.NYPizzaIngredientFactory;
import com.github.jengo.dp.hf.factory.pizzaaf.pizza.factory.PizzaIngredientFactory;

/**
 * 具体类：纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }

}
