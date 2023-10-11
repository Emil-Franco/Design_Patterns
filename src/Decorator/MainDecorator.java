package Decorator;


import java.lang.reflect.Method;

public class MainDecorator {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> clase = MiClase.class;
        Method method = clase.getMethod("miMetodo");

        if (method.isAnnotationPresent(MiAnotacion.class)){
            MiAnotacion miAnotacion = method.getAnnotation(MiAnotacion.class);
            System.out.println("Estado: " + miAnotacion.run());
            System.out.println("Velocidad: " + miAnotacion.valor());
        }else {
            System.out.println("La anotacion no esta presente en el metodo. ");
        }
    }
}