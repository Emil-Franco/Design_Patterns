package Decorator;

// clase que implementa el componente base
public class CafeSimple implements Cafe {
    @Override
    // Metodo que nos devuelve un la descripcion de nuestro objeto
    public String verDescripcion() {
        return "cafe simple";
    }
}
