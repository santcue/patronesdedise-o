package EjemploFacade;

public class RestauranteFacade {
    private Cocina cocina;
    private Mesa mesa;

    public RestauranteFacade() {
        cocina = new Cocina();
        mesa = new Mesa();
    }

    public void atenderCliente() {
        cocina.prepararIngredientes();
        cocina.cocinarPlato();
        cocina.servirPlato();
        mesa.limpiarMesa();
        mesa.colocarPlatos();
        mesa.decorarMesa();
        System.out.println("Cliente atendido con éxito");
    }
}
