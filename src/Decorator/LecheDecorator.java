package Decorator;


// Decorador que heredan de decorador cafe
public class LecheDecorator extends Decoradorcafe {

    // contructor de la clase
    public LecheDecorator(Cafe cafedecorador){
        super(cafedecorador);
    }
    @Override
    // Metodo que nos devuelve el cafe con el decorador "en este caso cafe con leche"
    public String verDescripcion() {
        return super.verDescripcion() + ", con leche";
    }
}
