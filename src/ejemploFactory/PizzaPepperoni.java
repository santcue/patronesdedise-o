package ejemploFactory;

public class PizzaPepperoni implements Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando pizza de pepperoni");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de pepperoni");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza de pepperoni");
    }

    @Override
    public void empaquetar() {
        System.out.println("Empaquetando pizza de pepperoni");
    }
}

