package Strategy;

// Este metodo recibe 2 numero como parametro y devuelve el resultado del calculo.
public class Calculator {
    // Utiliza la operacion almacena en este atributo OPERATION.
    private Operation operation;

    public Calculator(Operation operation){
        this.operation = operation;
    }

    // Este metodo establece la operacion que se va a utilizar para calcular el resultado.
    public void setOperacion(Operation operation){
        this.operation = operation;
    }

    // Este método calcula el resultado utilizando la operación almacenada en el atributo operation.
    public int calculate(int num1, int num2) {
        return operation.execute(num1, num2);
    }
}
