package factory.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngrentFactory();

        if (item.equals("cheese")) {
            pizza =  new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de Queijo no Estilo Chicago");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Pizza de Mariscos no Estilo Chicago");
        }

        return pizza;
    }
}
