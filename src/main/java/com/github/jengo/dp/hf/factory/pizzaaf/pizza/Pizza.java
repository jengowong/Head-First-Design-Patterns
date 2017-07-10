package com.github.jengo.dp.hf.factory.pizzaaf.pizza;

import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.cheese.Cheese;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.clams.Clams;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.daugh.Dough;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.sauce.Sauce;
import com.github.jengo.dp.hf.factory.pizzaaf.ingredient.veggies.Veggies;

/**
 * 抽象类：披萨
 */
public abstract class Pizza {
    /** 披萨名 */
    protected String name;
    /** 面皮 */
    protected Dough dough;
    /** 调味汁 */
    protected Sauce sauce;
    /** 蔬菜 */
    protected Veggies veggies[];
    /** 奶酪 */
    protected Cheese cheese;
    /** 香肠 */
    protected Pepperoni pepperoni;
    /** 蛤蜊 */
    protected Clams clam;

    /**
     * 抽象方法：准备
     */
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(this.name).append(" ----\n");
        if (this.dough != null) {
            result.append(this.dough);
            result.append("\n");
        }
        if (this.sauce != null) {
            result.append(this.sauce);
            result.append("\n");
        }
        if (this.cheese != null) {
            result.append(this.cheese);
            result.append("\n");
        }
        if (this.veggies != null) {
            for (int i = 0; i < this.veggies.length; i++) {
                result.append(this.veggies[i]);
                if (i < this.veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (this.clam != null) {
            result.append(this.clam);
            result.append("\n");
        }
        if (this.pepperoni != null) {
            result.append(this.pepperoni);
            result.append("\n");
        }
        return result.toString();
    }

}
