package Singleton;
// nos garantiza que solo va a aver una sola instancia de la clase en un programa
public class Persona {
    private static Persona instance;

    private Persona(){}

    public static Persona getInstance(){
        if (instance == null){
            instance = new Persona();
        }
        return instance;
    }
}
