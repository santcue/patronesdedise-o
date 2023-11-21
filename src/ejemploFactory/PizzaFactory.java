package ejemploFactory;

public class PizzaFactory {
    public Pizza crearPizza(String tipo) {
        if (tipo.equalsIgnoreCase("hawaiana")) {
            return new PizzaHawaiana();
        } else if (tipo.equalsIgnoreCase("pepperoni")) {
            return new PizzaPepperoni();
        } else {
            throw new IllegalArgumentException("Tipo de pizza no válido");
        }
    }
}
