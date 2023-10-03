package Factory;

public class FabricaAutomoviles extends FabricaVehiculos {
    public Vehiculo crearVehiculo() {
        return new Automovil();
    }
}
