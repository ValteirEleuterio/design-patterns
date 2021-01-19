package factory.abstractfactory;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSouce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();

}
