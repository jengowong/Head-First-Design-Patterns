package headfirst.designpatterns.factory.pizzas;

/**
 * 具体类：奶酪披萨
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust"; //常规
        sauce = "Marinara Pizza Sauce"; //杂菜
        toppings.add("Fresh Mozzarella"); //马苏里拉奶酪
        toppings.add("Parmesan"); //帕尔马干酪
    }

}
