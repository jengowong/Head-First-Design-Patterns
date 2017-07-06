package com.github.jengo.dp.hf.factory.pizzafm;

/**
 * 具体类：纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new NYStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new NYStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }

}
