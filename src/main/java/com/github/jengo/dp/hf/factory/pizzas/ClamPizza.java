package com.github.jengo.dp.hf.factory.pizzas;

/**
 * 具体类：蛤蜊披萨
 */
public class ClamPizza extends Pizza {

    public ClamPizza() {
        this.name = "Clam Pizza";
        this.dough = "Thin crust";                   //薄皮
        this.sauce = "White garlic sauce";           //白蒜
        this.toppings.add("Clams");                  //蛤蜊
        this.toppings.add("Grated parmesan cheese"); //
    }

}
