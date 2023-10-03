import Decorator.*;
import DTO_Data_Transfer_Object.*;
import Factory.*;
import Repository.*;
import Strategy.*;


public class Main {
    public static void main(String[] args) {

        // Factory
        FabricaVehiculos fabricaAutomoviles = new FabricaAutomoviles();
        Vehiculo automovil = fabricaAutomoviles.crearVehiculo();
        automovil.acelerar();
        automovil.frenar();

        FabricaVehiculos fabricaBicicletas = new FabricaBicicletas();
        Vehiculo bicicleta = fabricaBicicletas.crearVehiculo();
        bicicleta.acelerar();
        bicicleta.frenar();
        System.out.println("--------------------------------------------------------------------------------------------");
        // Decorator
        Cafe cafeSimple = new CafeSimple();
        System.out.println("Café Simple:");
        System.out.println("Descripción: " + cafeSimple.verDescripcion());

        Cafe cafeConLeche = new LecheDecorator(cafeSimple);
        System.out.println("\nCafé con Leche:");
        System.out.println("Descripción: " + cafeConLeche.verDescripcion());

        System.out.println("--------------------------------------------------------------------------------------------");
        // Strategy
        Calculadora calculadora = new Calculadora(new Suma());

        int resultadoSuma = calculadora.calcular(10, 5);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        calculadora.setOperacion(new Resta());
        int resultadoResta = calculadora.calcular(10, 5);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("--------------------------------------------------------------------------------------------");
        // DTO "Data Transfer Object"

        UsuarioDTO user1 = new UsuarioDTO("Emil", "efrancocusme@gmail.com");
        UsuarioDTO user2 = new UsuarioDTO("Joao", "walterjoao@gmail.com");

        //Acceder a los atributos del DTO
        System.out.println("User 1 - Name --> " + user1.getNombre());
        System.out.println("User 1 - Mail --> " + user1.getCorreo());
        System.out.println("----------------------------------");
        System.out.println("User 2 - Name --> " + user2.getNombre());
        System.out.println("User 2 - Mail --> "  + user2.getCorreo());
        System.out.println("----------------------------------");
        //Modificando los atributos del DTO
        user1.setNombre("Angelica");
        user1.setCorreo("francoangelica@gmail.com");
        System.out.println("User 1 - Update Name --> " + user1.getNombre());
        System.out.println("User 1 - Update Mail --> " + user1.getCorreo());
        System.out.println("----------------------------------");
        //Imprimir la informacion del DTO
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println("--------------------------------------------------------------------------------------------");
        //Repository
        // Crear usuarios
        User usuario1 = new User(1L, "Juan", "juan@example.com");
        User usuario2 = new User(2L, "María", "maria@example.com");

    }
}
