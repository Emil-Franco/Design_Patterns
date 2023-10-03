package Decorator;

public interface Cafe {
    default String verDescripcion() {
        return null;
    }
}
