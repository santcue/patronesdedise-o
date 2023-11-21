package EjemploSingleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("Instancia 1");
        singleton1.showMessage();

        Singleton singleton2 = Singleton.getInstance("Instancia 2");
        singleton2.showMessage();

        Singleton singleton3 = Singleton.getInstance("Instancia 3");
        singleton3.showMessage();
    }
}

