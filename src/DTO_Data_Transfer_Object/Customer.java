package DTO_Data_Transfer_Object;

public class Customer {

    private Long id;
    private String name;
    private String email;
    private Rol rol;

    public Customer(){}

    public Customer(Long id, String name, String email, Rol rol) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.rol = rol;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
