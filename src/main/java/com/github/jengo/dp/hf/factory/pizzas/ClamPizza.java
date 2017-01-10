package com.github.jengo.dp.hf.factory.pizzas;

/**
 * 具体类：蛤蜊披萨
 */
public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust"; //薄皮
        sauce = "White garlic sauce"; //白蒜
        toppings.add("Clams"); //蛤蜊
        toppings.add("Grated parmesan cheese"); //
    }

}
