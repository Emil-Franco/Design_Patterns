package Factory;

// Esta clase Hereda de FactoryVehiculos y su metodo.
public class AutomobileFactory extends FactoryVehicles {

    // Este metodo crea un Vehiculo en este caso un Automovil.
    public IVehicle createVehicle(String type) {
        if (type.equals("bicycle")){
            return new Bicycle();
        }else{
            return new Car();
        }
    }
}
