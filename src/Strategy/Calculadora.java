package Strategy;

public class Calculadora {

    private Operacion operacion;

    public Calculadora(Operacion operacion){
        this.operacion = operacion;
    }

    public void setOperacion(Operacion operacion){
        this.operacion = operacion;
    }
    public int calcular(int num1, int num2) {
        return operacion.ejecutar(num1, num2);
    }
}
