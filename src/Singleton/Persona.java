package Singleton;

// Creamos una clase persona con su contructor privado.
public class Persona {
    private static Persona instance;

    private Persona(){}

// Este metodo comprueba si la instancia existe o si no existe.
// Si la instancia no existe crea una pero si existe devuelve la existente.
    public static Persona getInstance(){
        if (instance == null){
            instance = new Persona();
        }
        return instance;
    }
}
