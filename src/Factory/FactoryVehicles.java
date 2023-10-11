package Factory;

// Esta clase abstracta define un metodo abstracto
// Este metodo de ser implementado por cualquier clase que herede de esta clase
public abstract class FactoryVehicles {
    public abstract IVehicle createVehicle(String type);
}
