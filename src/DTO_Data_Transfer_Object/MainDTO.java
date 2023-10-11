package DTO_Data_Transfer_Object;

public class MainDTO {
    public static void main(String[] args) {
        Rol rol = new Rol();
        rol.setId(1L);
        rol.setName("Administrador");

        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("John Doe");
        customer.setEmail("john@example.com");
        customer.setRol(rol);

        // Convertir un Usuario en un UsuarioDTO
        CustomerDTO usuarioDTO = new CustomerDTO(
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                customer.getRol().getName()
        );

        System.out.println(usuarioDTO);
    }

}
