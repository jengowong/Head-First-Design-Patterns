package com.github.jengo.dp.hf.factory.pizzafm;

/**
 * 具体类：芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new ChicagoStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }

}
