package com.github.jengo.dp.hf.factory.pizzas;

/**
 * 具体类：素食披萨
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        this.name = "Veggie Pizza";
        this.dough = "Crust";
        this.sauce = "Marinara sauce";
        this.toppings.add("Shredded mozzarella");
        this.toppings.add("Grated parmesan");
        this.toppings.add("Diced onion");
        this.toppings.add("Sliced mushrooms");
        this.toppings.add("Sliced red pepper");
        this.toppings.add("Sliced black olives");
    }

}
