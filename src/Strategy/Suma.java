package Strategy;

public class Suma implements Operacion{
    @Override
    public int ejecutar(int num1, int num2) {
        return num1 + num2;
    }
}
