package Factory;

// // Esta clase Automovil implementa la interfaz Vehiculo y sus metodos.
class Car implements Vehicle {

    // Metodos que nos devuelve un mensaje que la accion que esta realizando nuestro objeto
    public void speed_up() {
        System.out.println("El automóvil está acelerando.");
    }

    public void curb() {
        System.out.println("El automóvil está frenando.");
    }
}
