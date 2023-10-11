package DTO_Data_Transfer_Object;

import java.io.Serializable;

public class CustomerDTO{

    private Long id;
    private String name;
    private String email;
    private String namerol;


    public  CustomerDTO(){}
    public CustomerDTO(Long id, String name, String email, String namerol) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.namerol = namerol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamerol() {
        return namerol;
    }

    public void setNamerol(String namerol) {
        this.namerol = namerol;
    }


    public String toString() {
        return "UsuarioDTO{" +
                "id = " + id +
                ", nombre = '" + name + '\'' +
                ", correo = '" + email + '\'' +
                ", nombreRol = '" + namerol + '\'' +
                '}';
    }
}
