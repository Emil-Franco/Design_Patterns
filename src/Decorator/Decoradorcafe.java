package Decorator;

abstract class Decoradorcafe implements Cafe {
    protected Cafe cafedecorador;

    public Decoradorcafe(Cafe cafedecorador){
        this.cafedecorador = cafedecorador;
    }

    public String verdescripcion(){
        return cafedecorador.verDescripcion();
    }
}
