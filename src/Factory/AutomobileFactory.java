package Factory;

// Esta clase Hereda de FactoryVehiculos y su metodo.
public class AutomobileFactory extends FactoryVehicles {

    // Este metodo crea un Vehiculo en este caso un Automovil.
    public Vehicle createVehicle() {
        return new Car();
    }
}
