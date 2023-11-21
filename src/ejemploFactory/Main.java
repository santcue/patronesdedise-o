package ejemploFactory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza pizzaHawaiana = pizzaFactory.crearPizza("hawaiana");
        pizzaHawaiana.preparar();
        pizzaHawaiana.hornear();
        pizzaHawaiana.cortar();
        pizzaHawaiana.empaquetar();

        Pizza pizzaPepperoni = pizzaFactory.crearPizza("pepperoni");
        pizzaPepperoni.preparar();
        pizzaPepperoni.hornear();
        pizzaPepperoni.cortar();
        pizzaPepperoni.empaquetar();
    }
}

