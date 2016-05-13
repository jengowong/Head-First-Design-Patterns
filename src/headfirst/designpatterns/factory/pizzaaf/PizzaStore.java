package headfirst.designpatterns.factory.pizzaaf;

import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;

/**
 * 抽象类：披萨店
 */
public abstract class PizzaStore {

    /**
     * 工厂方法
     *
     * @param item 披萨类型
     *
     * @return {@link Pizza}
     */
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
