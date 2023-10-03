package Strategy;

// Esta clase implementa a la interfaz Operation y su metodo.
public class Addition implements Operation {
    @Override
    // Utilizamos el metodo ejecutar para crear la operacion en este caso la suma
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}
