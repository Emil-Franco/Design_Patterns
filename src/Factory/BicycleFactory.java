package Factory;


// Esta clase Hereda de FactoryVehiculos y su metodo.
public class BicycleFactory extends FactoryVehicles {
    // Este metodo crea un vehiculo en este caso una bicicleta
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
