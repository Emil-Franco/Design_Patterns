package Repository;

import java.util.List;

public interface UserRepository {
    User guardar(User user);
    User obtenerPorId(Long id);
    List<User> obtenerTodos();
    void eliminar(Long id);
}
