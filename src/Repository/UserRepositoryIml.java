package Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryIml implements UserRepository {
    public Map<Long, User>userMap = new HashMap<>();
    public Long counterId = 1L;


    @Override
    public User guardar(User user) {
        Map<Long,User>copy = new HashMap<>(userMap);
        if (user.getId() == null){
            copy.put(counterId++, user);
        }else {
            copy.put(user.getId(),user);
        }
        userMap = copy;
        return user;
    }

    @Override
    public User obtenerPorId(Long id) {
        return userMap.get(id);
    }

    @Override
    public List<User> obtenerTodos() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void eliminar(Long id) {
        userMap.remove(id);

    }
}

