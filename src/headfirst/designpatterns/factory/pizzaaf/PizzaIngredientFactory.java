package headfirst.designpatterns.factory.pizzaaf;

/**
 * 抽象类：披萨食材工厂(抽象工厂)
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
