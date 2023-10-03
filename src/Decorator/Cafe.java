package Decorator;


// Interfaz que define el objeto base
public interface Cafe {
    default String verDescripcion() {
        return null;
    }
}
