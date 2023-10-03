package Repository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryIml implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public User findById(Long id) {
        for (User usuario : users) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }


    @Override
    public void delete(Long id) {
        users.removeIf(usuario -> usuario.getId().equals(id));
    }
    }

