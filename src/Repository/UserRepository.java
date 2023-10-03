package Repository;

import java.util.List;

// Creamos una interfaz que contengan los metodos que necesitemos.
public interface UserRepository {
    void save(User user);
    User getById(Long id);
    List<User> getAll();
    void delete(Long id);
}
