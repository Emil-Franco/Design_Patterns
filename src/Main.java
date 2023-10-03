import Decorator.*;
import DTO_Data_Transfer_Object.*;
import Factory.*;
import Repository.*;
import Strategy.*;
import Singleton.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Factory
        FactoryVehicles fabricaAutomoviles = new AutomobileFactory();
        Vehicle automovil = fabricaAutomoviles.createVehicle();
        automovil.speed_up();
        automovil.curb();
        FactoryVehicles fabricaBicicletas = new BicycleFactory();
        Vehicle bicicleta = fabricaBicicletas.createVehicle();
        bicicleta.speed_up();
        bicicleta.curb();
        System.out.println("--------------------------------------------------------------------------------------------");
//----------------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------------
        // Strategy
        Calculator calculator = new Calculator(new Addition());
        int resultadoSuma = calculator.calculate(10, 5);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        calculator.setOperacion(new Subtraction());
        int resultadoResta = calculator.calculate(10, 5);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("--------------------------------------------------------------------------------------------");
//----------------------------------------------------------------------------------------------------------------------

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
        System.out.println("--------------------------------------------------------------------------------------------");
//----------------------------------------------------------------------------------------------------------------------

        //Repository
        UserRepository userRepository = new UserRepositoryIml();
        // Guardar usuarios
        User user4 = new User(1L, "Emil","Efranco@gmail.com");
        userRepository.save(user4);

        User user5 = new User(2L, "Joao", "Walterjoao@gmail.com");
        userRepository.save(user5);
        System.out.println("----------------------------------");

        // Obtener todos los usuarios
        List<User> users = userRepository.getAll();
        for (User user : users){
            System.out.println(" ID --> " + user.getId() + " Name --> " + user.getName() + " Mail --> " + user.getMail());
        }

        // Obtener usuarios por ID
        User recovereduser = userRepository.getById(1L);
        System.out.println(" ID recovered --> " + recovereduser.getId() + " Name recovered --> " + recovereduser.getName() + " Mail recovered --> " + recovereduser.getMail());

        userRepository.delete(2L);

//----------------------------------------------------------------------------------------------------------------------

        System.out.println("--------------------------------------------------------------------------------------------");
        //Singleton
        Persona persona1 = Persona.getInstance();

        Persona persona2 = Persona.getInstance();

        if (persona1 == persona2){
            System.out.println("Las dos intancias son iguales");
        }else {
            System.out.println("Las dos intancias son diferentes");
        }

        System.out.println(persona1);
        System.out.println(persona2);


    }
}
