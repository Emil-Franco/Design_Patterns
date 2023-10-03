package Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryIml implements UserRepository {
    // Declaramos un mapa donde long es la clave unica de cada usuario y User es el objeto
    // HasMap lo utilizamos para almacenar datos en memoria
    public Map<Long, User>userMap = new HashMap<>();
    // Utilizamos este contador para asignar el id a cada usuario
    public Long counterId = 1L;



    @Override
    // En este metodo creamos una copia del mapa original para trabajar con la copia en vez de la original
    public void save(User user) {
        Map<Long,User>copy = new HashMap<>(userMap);
        if (user.getId() == null){
            copy.put(counterId++, user);
        }else {
            copy.put(user.getId(),user);
        }
        userMap = copy;
    }

    @Override
    // Este metodo nos proporciona un usuario por su id
    public User getById(Long id) {
        return userMap.get(id);
    }

    @Override
    // Este metodo nos proporciona a todos los usuarios
    public List<User> getAll() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    // Este es un procedimiento que elimina un usuario por su id
    public void delete(Long id) {
        userMap.remove(id);

    }
}

