package Strategy;

// Este metodo recibe 2 numero como parametro y devuelve el resultado del calculo.
public class Calculator {


    // Este método calcula el resultado utilizando la operación almacenada en el atributo operation.
    public int calculate(IOperation iOperation, int num1, int num2) {
        return iOperation.execute(num1, num2);
    }
}
