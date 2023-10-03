package Decorator;

// Decorador abstracto que implementa la intefaz cafe
abstract class Decoradorcafe implements Cafe {
    protected Cafe cafedecorador;

    // contructor de la clase
    public Decoradorcafe(Cafe cafedecorador){
        this.cafedecorador = cafedecorador;
    }


    // Metodo que nos devuelve la descripcion de nuestro objeto decorado
    public String verdescripcion(){
        return cafedecorador.verDescripcion();
    }
}
