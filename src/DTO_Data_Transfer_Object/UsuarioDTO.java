package DTO_Data_Transfer_Object;

// creamos un objeto con sus atributos
public class UsuarioDTO {
    private String name;
    private String mail;

// creamos un contructor vacio
    public UsuarioDTO(){}

// creamos un contructor con los atributos
    public UsuarioDTO(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

// creamos su getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
