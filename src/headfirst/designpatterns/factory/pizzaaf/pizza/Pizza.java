package headfirst.designpatterns.factory.pizzaaf.pizza;

import headfirst.designpatterns.factory.pizzaaf.cheese.Cheese;
import headfirst.designpatterns.factory.pizzaaf.clams.Clams;
import headfirst.designpatterns.factory.pizzaaf.daugh.Dough;
import headfirst.designpatterns.factory.pizzaaf.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.sauce.Sauce;
import headfirst.designpatterns.factory.pizzaaf.veggies.Veggies;

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
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }

}
