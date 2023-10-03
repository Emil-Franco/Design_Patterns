package Decorator;

public class LecheDecorator extends Decoradorcafe {
    public LecheDecorator(Cafe cafedecorador){
        super(cafedecorador);
    }
    @Override
    public String verDescripcion() {
        return super.verDescripcion() + ", con leche";
    }
}
