package headfirst.designpatterns.factory.pizzas;

import java.util.ArrayList;

/**
 * 抽象类：披萨
 */
abstract public class Pizza {

    /** 名称 */
    String name;
    /** 生面团 */
    String dough;
    /** 调味汁 */
    String sauce;
    /** 馅料 */
    ArrayList<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
