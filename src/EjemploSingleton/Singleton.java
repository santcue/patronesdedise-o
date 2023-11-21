package EjemploSingleton;

public class Singleton {
    private static Singleton instance;
    private String name;

    private Singleton(String name) {
        this.name = name;
        System.out.println("Se ha creado una instancia de Singleton con el nombre: " + name);
    }

    public static synchronized Singleton getInstance(String name) {
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("¡Hola! Soy el Singleton " + name);
    }
}

