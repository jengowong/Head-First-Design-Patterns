package headfirst.designpatterns.factory.pizzaaf;

import headfirst.designpatterns.factory.pizzaaf.pizza.CheesePizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.ClamPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.PepperoniPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.VeggiePizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.factory.ChicagoPizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.pizza.factory.PizzaIngredientFactory;

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
