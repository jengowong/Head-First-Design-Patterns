package com.github.jengo.dp.hf.factory.pizzas;

/**
 * 具体类：奶酪披萨
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        this.name = "Cheese Pizza";             //芝士披萨
        this.dough = "Regular Crust";           //常规面包皮
        this.sauce = "Marinara Pizza Sauce";    //杂菜
        this.toppings.add("Fresh Mozzarella");  //马苏里拉奶酪
        this.toppings.add("Parmesan");          //帕尔马干酪
    }

}
