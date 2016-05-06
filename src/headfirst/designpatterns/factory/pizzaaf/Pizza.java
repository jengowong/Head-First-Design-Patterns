package headfirst.designpatterns.factory.pizzaaf;

/**
 * 抽象类：披萨
 */
public abstract class Pizza {
    /** 披萨名 */
    String name;
    /** 面皮 */
    Dough dough;
    /** 调味汁 */
    Sauce sauce;
    /** 蔬菜 */
    Veggies veggies[];
    /** 奶酪 */
    Cheese cheese;
    /** 香肠 */
    Pepperoni pepperoni;
    /** 蛤蜊 */
    Clams clam;

    /**
     * 抽象方法：准备
     */
    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
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
