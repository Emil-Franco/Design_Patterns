package Repository;

import java.util.List;

public interface UserRepository {
    User findById(Long id);

    List<User> findAll();

    void delete(Long id);

}
