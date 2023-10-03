package Factory;

// Esta clase bicicleta implementa la interfaz Vehiculo y sus metodos.
public class Bicycle implements Vehicle {

    // Metodos que nos devuelve un mensaje que la accion que esta realizando nuestro objeto
    public void speed_up() {
        System.out.println("La bicicleta está acelerando.");
    }

    public void curb() {
        System.out.println("La bicicleta está frenando.");
    }
}

