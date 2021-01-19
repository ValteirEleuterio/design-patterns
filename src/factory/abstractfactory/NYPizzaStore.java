package factory.abstractfactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza =  new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de Queijo no Estilo de Nova York");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Pizza de Mariscos no Estilo de Nova York");
        }

        return pizza;
    }
}
