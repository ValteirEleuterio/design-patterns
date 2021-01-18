package decorator;

public class StarbuzzCoffee {


    public static void main(String[] args) {
        Beverage beverage = new Expresso(); //Expresso sem condimentos
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2); // Adicionamos mocha
        beverage2 = new Mocha(beverage2); // Adicionamos mais mocha
        beverage2 = new Whip(beverage2); // Adicionamos Whip
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3); //Adicionamos soy
        beverage3 = new Mocha(beverage3); // Adicionamos mocha
        beverage3 = new Whip(beverage3); // Adicionamos whip
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }

}

