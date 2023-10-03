import Decorator.*;
import DTO_Data_Transfer_Object.*;
import Factory.*;
import Repository.*;
import Strategy.*;

import java.util.List;


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
        // creamos un cafe simple
        Cafe cafeSimple = new CafeSimple();
        System.out.println("Café Simple:");
        System.out.println("Descripción: " + cafeSimple.verDescripcion());

        // creamos un cafe con leche
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
        System.out.println("User 1 - Name --> " + user1.getName());
        System.out.println("User 1 - Mail --> " + user1.getMail());
        System.out.println("----------------------------------");
        System.out.println("User 2 - Name --> " + user2.getName());
        System.out.println("User 2 - Mail --> "  + user2.getMail());
        System.out.println("----------------------------------");
        //Modificando los atributos del DTO
        user1.setName("Angelica");
        user1.setMail("francoangelica@gmail.com");
        System.out.println("User 1 - Update Name --> " + user1.getName());
        System.out.println("User 1 - Update Mail --> " + user1.getMail());
        System.out.println("----------------------------------");
        //Imprimir la informacion del DTO
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println("--------------------------------------------------------------------------------------------");


        //Repository
        UserRepository userRepository = new UserRepositoryIml();
        // Guardar usuarios
        System.out.println("----------------------------------");
        User user4 = new User(1L, "Emil","Efranco@gmail.com");
        userRepository.guardar(user4);

        User user5 = new User(2L, "Joao", "Walterjoao@gmail.com");
        userRepository.guardar(user5);
        System.out.println("----------------------------------");

        // Obtener todos los usuarios
        List<User> users = userRepository.obtenerTodos();
        for (User user : users){
            System.out.println(" ID --> " + user.getId() + " Name --> " + user.getNombre() + " Mail --> " + user.getCorreo());
        }

        // Obtener usuarios por ID
        User recovereduser = userRepository.obtenerPorId(1L);
        System.out.println(" ID recovered --> " + recovereduser.getId() + " Name recovered --> " + recovereduser.getNombre() + " Mail recovered --> " + recovereduser.getCorreo());

        userRepository.eliminar(2L);
    }
}
