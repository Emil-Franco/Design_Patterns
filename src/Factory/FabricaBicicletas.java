package Factory;

public class FabricaBicicletas extends FabricaVehiculos {
    public Vehiculo crearVehiculo() {
        return new Bicicleta();
    }
}
