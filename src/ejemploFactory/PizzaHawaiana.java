package ejemploFactory;

public class PizzaHawaiana implements Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando pizza hawaiana");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza hawaiana");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza hawaiana");
    }

    @Override
    public void empaquetar() {
        System.out.println("Empaquetando pizza hawaiana");
    }
}

